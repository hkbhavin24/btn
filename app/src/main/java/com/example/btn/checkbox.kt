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

        button.setOnClickListener{
            var checked = ""
            if (binding.checkBox.isChecked) {
                checked += "Reading, "
                Toast.makeText(applicationContext, "${binding.checkBox.text}", Toast.LENGTH_SHORT).show()
            }
            if (binding.checkBox2.isChecked) {
                checked += "Reading, "
                Toast.makeText(applicationContext, "${binding.checkBox2.text}", Toast.LENGTH_SHORT).show()
            }

            if (binding.checkBox3.isChecked) {
                Toast.makeText(applicationContext, "${binding.checkBox3.text}", Toast.LENGTH_SHORT).show()
            }

            if (binding.checkBox4.isChecked) {
                Toast.makeText(applicationContext, "${binding.checkBox4.text}", Toast.LENGTH_SHORT).show()
            }
            if (binding.checkBox5.isChecked) {
                Toast.makeText(applicationContext, "${binding.checkBox5.text}", Toast.LENGTH_SHORT).show()
            }

        }

    }
}

