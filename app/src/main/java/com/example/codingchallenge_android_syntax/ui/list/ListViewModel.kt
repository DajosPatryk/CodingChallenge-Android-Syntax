package com.example.codingchallenge_android_syntax.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.codingchallenge_android_syntax.data.DataController
import com.example.codingchallenge_android_syntax.data.Player

class ListViewModel : ViewModel() {

    // Fetching Players data
    private val dataController = DataController()
    private val _players = MutableLiveData<List<Player>>().apply {
        value = dataController.getAllPlayers()
    }

    val players: LiveData<List<Player>> = _players
}