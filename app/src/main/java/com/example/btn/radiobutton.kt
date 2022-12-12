package com.example.btn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.constraintlayout.widget.Group
import com.example.btn.databinding.ActivityMainBinding
import com.example.btn.databinding.ActivityRadiobuttonBinding

class radiobutton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityRadiobuttonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rdgroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{Group,checkedid->
        var radio: RadioButton = findViewById (checkedid)
                binding.submit.setOnClickListener{
                    binding.txt.text = "Selected Age is - " + radio.text
                }
//                Toast.makeText(applicationContext, "${radio.text}", Toast.LENGTH_SHORT).show()
            }

        )



    }
}