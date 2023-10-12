package com.example.trackmycal

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import com.example.trackmycal.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnGetStarted.setOnClickListener {
                val intentToThirdActivity = Intent(this@SecondActivity, ThirdActivity::class.java)

                startActivity(intentToThirdActivity)
            }
        }

    }
}