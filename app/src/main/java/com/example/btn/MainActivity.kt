package com.example.btn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.btn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.chat.setOnClickListener {

            loadFragment(userFragment())

//            var user = userFragment()
//            var manager = supportFragmentManager
//            var trasaction = manager.beginTransaction()
//            trasaction.replace(R.id.fragframe,user)
//            trasaction.commit()

        }

        binding.status.setOnClickListener {

            loadFragment(profile())
        }
        binding.call.setOnClickListener {

            loadFragment(call())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        var transation = supportFragmentManager.beginTransaction()
        transation.replace(R.id.fragframe, fragment)
        transation.commit()
    }
}