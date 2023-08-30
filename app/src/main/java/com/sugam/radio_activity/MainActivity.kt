package com.sugam.radio_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var yesbutton: RadioButton
    private lateinit var radioButton: RadioButton
    private lateinit var nobutton: RadioButton
    private lateinit var maybebutton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { radioGroup, id ->

            radioButton = findViewById(id)

            when (radioButton.id) {
                R.id.yesbutton -> {
                    Toast.makeText(this,"YES",Toast.LENGTH_SHORT).show()
                }
                R.id.nobutton -> {
                    Toast.makeText(this,"NO",Toast.LENGTH_SHORT).show()
                }
                R.id.maybebutton -> {
                    Toast.makeText(this,"MAY BE",Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}