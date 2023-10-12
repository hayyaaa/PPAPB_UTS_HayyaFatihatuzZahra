package com.example.trackmycal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.trackmycal.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnSave.setOnClickListener {
                val intent = Intent(this@FifthActivity, FourthActivity::class.java)

                startActivity(intent)
                finish()
            }
        }
    }
}