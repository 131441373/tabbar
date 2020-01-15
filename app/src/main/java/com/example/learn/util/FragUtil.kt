package com.example.learn.util

import androidx.fragment.app.Fragment
import com.example.learn.R
import com.example.learn.ui.fragment.Calendar
import com.example.learn.ui.fragment.Learn
import com.example.learn.ui.fragment.Look
import com.example.learn.ui.fragment.Today

object FragUtil {
    val today = Today()
    val calendar = Calendar()
    val look = Look()
    val learn = Learn()

    fun map(id: Int): Fragment {
        return when (id) {
            0 -> today
            1 -> calendar
            2 -> look
            else -> learn
        }
    }
}