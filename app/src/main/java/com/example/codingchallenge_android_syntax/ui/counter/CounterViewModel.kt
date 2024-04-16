package com.example.codingchallenge_android_syntax.ui.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class CounterViewModel : ViewModel() {

    private val _count = MutableLiveData<Int>().apply {
        value = 0
    }

    fun incrementCount() {
        _count.value = (_count.value ?: 0) + 1
    }

    val text: LiveData<String> = _count.map { count ->
        // These are GPT generated
        when (count) {
            0 -> "No Clicks"
            1 -> "The First"
            2 -> "0010"
            3 -> "The Magic Number"
            7 -> "Lucky"
            8 -> "Octal!"
            10 -> "A Perfect Ten"
            11 -> "Visionary"
            13 -> "Unlucky"
            21 -> "Blackjack"
            24 -> "A Full Day"
            33 -> "Master Teacher"
            42 -> "Meaning of Life"
            47 -> "The Cosmic Number"
            64 -> "A Stack"
            111 -> "Triple Digits"
            222 -> "Alignment"
            333 -> "Decisions, Decisions"
            404 -> "Not Found"
            444 -> "Home Base"
            555 -> "Massive Changes"
            777 -> "Jackpot"
            888 -> "Infinite Abundance"
            999 -> "Release"
            1000 -> "Millennium"
            1024 -> "A Kibibyte"
            1080 -> "Full Circle"
            1111 -> "Awakening Code"
            1234 -> "Step Sequence"
            1313 -> "Mystic Alley"
            1444 -> "Stellar Gateway"
            2048 -> "A Popular Slide"
            4096 -> "More Memory"
            7777 -> "Lucky Strikes"
            else -> "$count"
        }
    }
}