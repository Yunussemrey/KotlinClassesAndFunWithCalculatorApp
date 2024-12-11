package com.yunusemre.classesandfunctions

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // class and function
    private lateinit var myTextView : TextView // lateinit -> now define and later initialize
    private lateinit var myButton : Button
    private lateinit var nameEditText : EditText
    private lateinit var ageEditText: EditText
    private lateinit var jobEditText: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // init
        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        nameEditText = findViewById(R.id.nameText)
        ageEditText = findViewById(R.id.ageText)
        jobEditText = findViewById(R.id.jobText)

        // button onclick method - for example second method
        myButton.setOnClickListener {
           var name = nameEditText.text.toString()
            var age = ageEditText.text.toString().toIntOrNull() // -> Conversion ( String --> Integer )
            var job = jobEditText.text.toString()
            if (age != null) {
                val human = People(name,age,job)
                //myTextView.text = "Name : ${name} , age : ${age} , job : ${job} ." -> First method
                myTextView.text = "Name : ${human.name} , age : ${human.age} , job : ${human.job} ."
            }else{
                myTextView.text = "name or age or job fields null."
            }


        }

        // class usage

        val human_one = People("Yunus Emre",23,"Android Developer")
        myTextView.text = human_one.name
        /*
        human_one.name = "Yunus Emre"
        human_one.age = 23
        human_one.job = "Android Developer"
         */
        val human_two = People("Çağatay Ulusoy",32,"Actor")

        // Nullibity

        var anyNumber_one : Int? = null

        println(anyNumber_one) // app not exception but console write null.

        // 1 ) !! -> object not null.

        //println(anyNumber_one!! * 10) // null pointer exception. The app is error.

        // 2 ) Safe Call ( ? )
        anyNumber_one = 10
        println(anyNumber_one?.minus(5)) // console write null

        // 3 ) Elvis Operator

        println(anyNumber_one?.minus(3) ?: "null") // if object is null,operator's right side works.

        // 4 ) Null Control ( if - else )

        if (anyNumber_one != null) {
            println(anyNumber_one + 10)
        }else{
            println("null object")
        }

        // 5 ) if there is value the works but value is null don't works.
        anyNumber_one?.let {
            println(it * 10)
        }



    }

    fun mathSum(a : Double , b : Double) {
        println(a + b)
    }
    fun mathMultiply(a : Double , b : Double) : Double {
        return a * b
    }
    // button onclick method - for example first method
    /*fun buttonClicked(view : View) {
        // the button clicked action
        myTextView.text = "Button clicked action success!!"
    }

     */

}