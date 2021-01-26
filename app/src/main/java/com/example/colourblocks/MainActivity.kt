package com.example.colourblocks

import android.graphics.Color
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
    private lateinit var box_one_text: TextView
    private lateinit var box_two_text: TextView
    private lateinit var box_three_text: TextView
    private lateinit var box_four_text: TextView
    private lateinit var box_five_text: TextView
    private lateinit var constraint: ConstraintLayout

    //late initialise the binding variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // go ahead and use the binding variable here
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        box_one_text = findViewById(R.id.box1)
        box_two_text = findViewById(R.id.box2)
        box_three_text = findViewById(R.id.box3)
        box_four_text = findViewById(R.id.box4)
        box_five_text = findViewById(R.id.box5)
        constraint = findViewById(R.id.constraintLayout)
        setListeners()
    }

    private fun setListeners() {
        val listOfViews: List<View> =
            listOf(
                box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint
            )

        for (item in listOfViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }
}