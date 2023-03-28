package com.example.android3lesson2dop.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.android3lesson2dop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var randomNumberViewModel: RandomNumberViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        randomNumberViewModel = ViewModelProvider(this)[RandomNumberViewModel::class.java]

        initialize()
        setupListener()
    }

    private fun initialize() {
        randomNumberViewModel.randomNumberLiveData.observe(this) {
            binding.randomNumberTextView.text = it.toString()
        }
    }

    private fun setupListener() {
        binding.generateButton.setOnClickListener {
            randomNumberViewModel.generateRandomNumber()
        }
    }
}

