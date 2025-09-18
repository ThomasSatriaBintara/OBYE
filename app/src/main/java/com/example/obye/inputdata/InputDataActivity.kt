package com.example.obye.inputdata

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.API.ApiClient
import com.example.obye.R
import com.example.obye.model.ResponseData
import com.example.obye.model.UserData
import com.example.obye.result.ResultActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InputDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data)

        val inputAge = findViewById<EditText>(R.id.inputAge)
        val inputHeight = findViewById<EditText>(R.id.inputHeight)
        val inputWeight = findViewById<EditText>(R.id.inputWeight)
        val inputGender = findViewById<RadioGroup>(R.id.radioGender)
        val inputFamilyHistory = findViewById<RadioGroup>(R.id.radioFamilyHistory)
        val inputHighCalorie = findViewById<RadioGroup>(R.id.radioHighCalorie)
        val inputVegetable = findViewById<RadioGroup>(R.id.radioVegetable)
        val inputMainMeals = findViewById<RadioGroup>(R.id.radioMainMeals)
        val inputFoodBetweenMeals = findViewById<RadioGroup>(R.id.radiofoodBetweenMeals)
        val inputSmoking = findViewById<RadioGroup>(R.id.radioSmoking)
        val inputWater = findViewById<RadioGroup>(R.id.radioConsumeWater)
        val inputCalorieConsumption = findViewById<RadioGroup>(R.id.radioCalorieConsumption)
        val inputPhysicalActivity = findViewById<RadioGroup>(R.id.radioPhysicalActivity)
        val inputDevice = findViewById<RadioGroup>(R.id.radioDevice)
        val inputAlcohol = findViewById<RadioGroup>(R.id.radioAlcohol)
        val inputTransportation = findViewById<RadioGroup>(R.id.radioTransportation)
        val inputObesityCek = findViewById<RadioGroup>(R.id.radioObesityCek)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val age = inputAge.text.toString().toIntOrNull()
            val heightInMeters = inputHeight.text.toString().toFloatOrNull()?.div(100)
            val weight = inputWeight.text.toString().toFloatOrNull()

            if (age == null) {
                Toast.makeText(this, "Please enter a valid age", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (heightInMeters == null) {
                Toast.makeText(this, "Please enter a valid height in cm", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (weight == null) {
                Toast.makeText(this, "Please enter a valid weight", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val gender = if (inputGender.checkedRadioButtonId == R.id.Female) 0 else 1
            val familyHistory = if (inputFamilyHistory.checkedRadioButtonId == R.id.familyhistoryNo) 0 else 1
            val highCalorie = if (inputHighCalorie.checkedRadioButtonId == R.id.calorieNo) 0 else 1
            val vegetable = if (inputVegetable.checkedRadioButtonId == R.id.vegetableNever) 0 else 1
            val mainMeals = if (inputMainMeals.checkedRadioButtonId == R.id.meals1) 0 else 1
            val foodBetween = if (inputFoodBetweenMeals.checkedRadioButtonId == R.id.meals1) 0 else 1
            val doyousmoking = if (inputSmoking.checkedRadioButtonId == R.id.smokingNo) 0 else 1
            val waterDaily = if (inputWater.checkedRadioButtonId == R.id.water1L) 0 else 1
            val caloriesMonitor = if (inputCalorieConsumption.checkedRadioButtonId == R.id.calorieNo) 0 else 1
            val physicalActivity = if (inputPhysicalActivity.checkedRadioButtonId == R.id.activity0) 0 else 1
            val usingDevice = if (inputDevice.checkedRadioButtonId == R.id.hours0) 0 else 1
            val alcoholConsumption = if (inputAlcohol.checkedRadioButtonId == R.id.alcoholNo) 0 else 1
            val transportation = if (inputTransportation.checkedRadioButtonId == R.id.automobile) 0 else 1
            val obesityCek = if (inputObesityCek.checkedRadioButtonId == R.id.cekNo) 0 else 1

            val requestData = UserData(
                age = age,
                height = heightInMeters,
                weight = weight,
                gender = gender,
                family_history = familyHistory,
                high_caloric_food = highCalorie,
                freq_vegetables = when (inputVegetable.checkedRadioButtonId) {
                    R.id.vegetableNever -> 0
                    R.id.vegetableSometimes -> 1
                    R.id.VegetableAlways -> 3
                    else -> 3
                },
                main_meals = when (inputMainMeals.checkedRadioButtonId) {
                    R.id.meals1 -> 0
                    R.id.meals2 -> 1
                    R.id.meals3 -> 2
                    R.id.meals4 -> 3
                    else -> 3
                },
                food_between_meals = when (inputFoodBetweenMeals.checkedRadioButtonId) {
                    R.id.betweenNo -> 0
                    R.id.betweenSometimes -> 1
                    R.id.betweenFrequently -> 2
                    R.id.betweenAlways -> 3
                    else -> 1
                },
                smoking = doyousmoking,
                water_daily = when (inputWater.checkedRadioButtonId) {
                    R.id.water1L -> 0
                    R.id.water2L -> 1
                    R.id.water3L -> 2
                    else -> 2
                },
                calories_monitor = caloriesMonitor,
                physical_activity_freq = when (inputPhysicalActivity.checkedRadioButtonId) {
                    R.id.activity0 -> 0
                    R.id.acivity1 -> 1
                    R.id.acivity2 -> 2
                    R.id.activity3 -> 3
                    else -> 3
                },
                time_using_devices = when (inputDevice.checkedRadioButtonId) {
                    R.id.hours0 -> 0
                    R.id.hours1 -> 1
                    R.id.hours2 -> 2
                    else -> 2
                },
                alcohol_consumption = when (inputAlcohol.checkedRadioButtonId) {
                    R.id.alcoholNo -> 0
                    R.id.alcoholSometimes -> 1
                    R.id.alcoholFrequently -> 2
                    R.id.alcoholAlways -> 3
                    else -> 1
                },
                transportation = when (inputTransportation.checkedRadioButtonId) {
                    R.id.automobile -> 0
                    R.id.bike -> 1
                    R.id.motorbike -> 2
                    R.id.walking -> 4
                    else -> 4
                },
                obesity = when (inputObesityCek.checkedRadioButtonId) {
                    R.id.cekNo -> 0
                    R.id.cekSometimes -> 1
                    R.id.cekOften -> 2
                    R.id.cekEveryday -> 3
                    else -> 1
                }
            )

            ApiClient.instance.submitUserData(requestData).enqueue(object : Callback<ResponseData> {
                override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                    if (response.isSuccessful) {
                        val predictedClass = response.body()?.predicted_class ?: "Unknown"

                        val intent = Intent(this@InputDataActivity, ResultActivity::class.java)
                        intent.putExtra("PREDICTED_CLASS", predictedClass)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@InputDataActivity, "Error: ${response.message()}", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                    Toast.makeText(this@InputDataActivity, "Failure: ${t.message}", Toast.LENGTH_LONG).show()
                }
            })
        }
    }
}