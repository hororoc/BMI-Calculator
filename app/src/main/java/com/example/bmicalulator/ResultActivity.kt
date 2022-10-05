package com.example.bmicalulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.w
import android.widget.TextView
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        Log.d("ResultActivity", "height: $height, weight: $weight")

//        val bmi = weight / Math.pow((height / 100.0), 2.0) // Java
        val bmi: Double = weight / (height / 100.0).pow(2) // Kotlin
        val resultText = when {
            bmi >= 35 -> "고도 비만"
            bmi >= 30 -> "중정도 비만"
            bmi >= 25 -> "경도 비만"
            bmi >= 23 -> "과체중"
            bmi >= 18.5 -> "정상 체중"
            else -> "저체중"
        }

        val resultValueTextView = findViewById<TextView>(R.id.tv_bmi_result_value)
        val resultTextTextView = findViewById<TextView>(R.id.tv_bmi_result_text)

        resultValueTextView.text = bmi.toString()
        resultTextTextView.text = resultText
    }
}