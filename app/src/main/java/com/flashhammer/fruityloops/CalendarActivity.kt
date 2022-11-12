package com.flashhammer.fruityloops

import androidx.appcompat.app.AppCompatActivity
import java.util.*

class CalendarActivity : AppCompatActivity() {
    fun getCurrentCalendar(): Calendar {
        return Calendar.getInstance()
    }
    fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }
    fun getCurrentTimezone(): TimeZone {
        return Calendar.getInstance().timeZone
    }
    fun getCurrentTimeInMilis(): Long {
        return Calendar.getInstance().timeInMillis
    }
}