package com.example.trackmycal

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TimePicker
import android.widget.Toast
import com.example.trackmycal.databinding.ActivityThirdBinding

class ThirdActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    private lateinit var weightUnits : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        weightUnits = resources.getStringArray(R.array.weightUnits)


        with(binding) {

//          val adapterWeightUnits = ArrayAdapter(this@ThirdActivity, android.R.layout.simple_spinner_item, weightUnits)
//            adapterWeightUnits.setDropDownViewResource(com.google.android.material.R.layout.support_simple_spinner_dropdown_item)
//            spinnerWeightUnit.adapter = adapterWeightUnits
//
//            spinnerWeightUnit.onItemSelectedListener =
//                object : AdapterView.OnItemSelectedListener {
//                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//
//                        val weightUnit = weightUnits[position]
//                        Toast.makeText(this@ThirdActivity, weightUnit, Toast.LENGTH_SHORT).show()
//                    }
//
//                    override fun onNothingSelected(p0: AdapterView<*>?) {
//
//                    }
//                }

            btnSubmit.setOnClickListener {
                val intentToFourthActivity = Intent(this@ThirdActivity, FourthActivity::class.java)

                startActivity(intentToFourthActivity)
            }
        }

    }


//    override fun onDateSet(
//        view: android.widget.DatePicker?,
//        year: Int,
//        month: Int,
//        dayOfMonth: Int
//    ) {
//        val selectedDAte = "$dayOfMonth/${month+1}/$year"
//        binding.btnTargetDate.text = selectedDAte
//    }


}