package com.example.colourblocks

import android.graphics.Color
import android.graphics.Color.GRAY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.databinding.DataBindingUtil
import com.example.colourblocks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    //late initialise the binding variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // go ahead and use the binding variable here
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)




        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            val listOfViews: List<View> =
                listOf(
                    box1, box2, box3,
                    box4, box5, constraintLayout, box6,
                    box7, box8, box9, box10
                )



            for (item in listOfViews) {
                item.setOnClickListener { makeColored(it) }
            }
        }
    }


    private fun makeColored(view: View) {
        binding.apply {
            when (view) {

                // Boxes using Color class colors for background
                box1 -> view.setBackgroundColor(Color.DKGRAY)
                box2 -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
                box4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
                box5 -> view.setBackgroundResource(android.R.color.holo_green_light)

                box7 -> view.setBackgroundResource(android.R.color.holo_blue_bright)
                box8 -> view.setBackgroundResource(android.R.color.holo_blue_dark)
                box9 -> view.setBackgroundResource(android.R.color.holo_blue_light)

                box6 -> view.setBackgroundColor(Color.GRAY)
                box10 -> view.setBackgroundColor(Color.DKGRAY)

                else -> view.setBackgroundColor(Color.LTGRAY)


            }
        }
    }
}