package com.example.android3lesson2dop.ui.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel : ViewModel() {

    private val _randomNumberLiveData = MutableLiveData<Int>()

    val randomNumberLiveData: LiveData<Int> = _randomNumberLiveData

    fun generateRandomNumber() {
        val randomNumber = (0..100).random()
        _randomNumberLiveData.postValue(randomNumber)
    }
}