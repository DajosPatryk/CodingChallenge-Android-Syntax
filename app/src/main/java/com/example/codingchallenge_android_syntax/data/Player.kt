package com.example.codingchallenge_android_syntax.data

class Player(var firstName: String, var lastName: String, var score: Int) {
    open var favorite = false
    private var hash = ""

    init {
        val combined = "$firstName $lastName"
        this.hash = combined.hashCode().toUInt().toString(16).uppercase()
    }

    fun getHash(): String = hash
}