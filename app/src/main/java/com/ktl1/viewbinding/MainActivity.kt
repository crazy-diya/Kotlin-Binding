package com.ktl1.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktl1.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    /**Add buildFeature and dependencies after sync and rebuild */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /** 1st way
        binding.button.setOnClickListener{
            binding.textView.text = binding.edt.text.toString()
            binding.edt.setText("")
        }
        */

        /** 2nd Way
         * */
        binding.apply {
            button.setOnClickListener{
                textView.text = edt.text.toString()
                edt.setText("")
            }
        }


    }
}