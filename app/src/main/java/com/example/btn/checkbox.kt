package com.example.btn

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.btn.databinding.ActivityCheckboxBinding

class checkbox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityCheckboxBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button: Button = findViewById(R.id.submitButton)

        button.setOnClickListener {
            var checked = ""
            if (binding.checkBox.isChecked) {
                checked += "Reading\n"
            }
            if (binding.checkBox2.isChecked) {
                checked += "Swimming\n"
            }
            if (binding.checkBox3.isChecked) {
                checked += "Travelling\n"
            }
            if (binding.checkBox4.isChecked) {
                checked += "Sports\n"
            }
            if (binding.checkBox5.isChecked) {
                checked += "Watching Movies\n"
            }
                binding.txthobbies.text = checked
        }
    }
}
