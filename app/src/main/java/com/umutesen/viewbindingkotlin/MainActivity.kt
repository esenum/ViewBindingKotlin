package com.umutesen.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.umutesen.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private  lateinit var  textView:TextView

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //instead of r.layout.activity-define below lines when you open new activities other than Main
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

      //  textView=findViewById<TextView>(R.id.textView)
    }

    fun changeName(view: View){
       //  textView.text="Hello  Kotlin!!"
        binding.textView.text="Hello Jet Brains,Do you want Rocket Scientist?"
    }
}