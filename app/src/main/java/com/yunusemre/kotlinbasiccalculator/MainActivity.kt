package com.yunusemre.kotlinbasiccalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yunusemre.kotlinbasiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number_one : Double? = null
    var number_two : Double? = null
    var result : Double? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.btnSum.setOnClickListener {
            number_one = binding.numberOneEditText.text.toString().toDoubleOrNull()
            number_two = binding.numberTwoEditText.text.toString().toDoubleOrNull()
            // conversion
            if (number_one != null && number_two != null) {
                try {
                    result = number_one!! + number_two!!
                    binding.resultTextView.text = "Result : ${result}"
                }catch (e : NumberFormatException) {
                    Toast.makeText(this,"Please enter requried fields number!",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Please enter fields requried value !",Toast.LENGTH_SHORT).show()

            }
        }
        binding.btnExtraction.setOnClickListener {
            number_one = binding.numberOneEditText.text.toString().toDoubleOrNull()
            number_two = binding.numberTwoEditText.text.toString().toDoubleOrNull()
            // conversion
            if (number_one != null && number_two != null) {
                try {
                    result = number_one!! - number_two!!
                    binding.resultTextView.text = "Result : ${result}"
                }catch (e : NumberFormatException) {
                    Toast.makeText(this,"Please enter requried fields number!",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Please enter fields requried value !",Toast.LENGTH_SHORT).show()

            }
        }
        binding.btnImpact.setOnClickListener {
            number_one = binding.numberOneEditText.text.toString().toDoubleOrNull()
            number_two = binding.numberTwoEditText.text.toString().toDoubleOrNull()
            // conversion
            if (number_one != null && number_two != null) {
                try {
                    result = number_one!! * number_two!!
                    binding.resultTextView.text = "Result : ${result}"
                }catch (e : NumberFormatException) {
                    Toast.makeText(this,"Please enter requried fields number!",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Please enter fields requried value !",Toast.LENGTH_SHORT).show()

            }
        }
        binding.btnDivide.setOnClickListener {
            number_one = binding.numberOneEditText.text.toString().toDoubleOrNull()
            number_two = binding.numberTwoEditText.text.toString().toDoubleOrNull()
            // conversion
            if (number_one != null && number_two != null) {
                try {
                    result = number_one!! / number_two!!
                    binding.resultTextView.text = "Result : ${result}"
                }catch (e : NumberFormatException) {
                    Toast.makeText(this,"Please enter requried fields number!",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Please enter fields requried value !",Toast.LENGTH_SHORT).show()

            }
        }

    }
}