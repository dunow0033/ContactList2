package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.text

//        binding.button.setOnClickListener{
//            binding.button.text = "Today!!"
//            val toast = Toast.makeText(applicationContext, "hello", Toast.LENGTH_LONG)
//            toast.show()
//        }
        binding.buttonOpenFragment.setOnClickListener{
            openFragment()
        }
    }

    private fun openFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, ExampleFragment())
            .addToBackStack(null)
            .commit()
    }
}