package com.example.quizapp

object Validator {
    fun validateInput(amount: Int, desc: String) : Boolean {
        return !(amount <= 0 || desc.isEmpty())

    }
}