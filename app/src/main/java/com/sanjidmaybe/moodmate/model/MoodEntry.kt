package com.sanjidmaybe.moodmate.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mood_table")
data class MoodEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val mood: String,
    val note: String,
    val timestamp: Long
) {
}