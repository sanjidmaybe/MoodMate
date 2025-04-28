package com.sanjidmaybe.moodmate.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.sanjidmaybe.moodmate.model.MoodEntry

@Dao
interface MoodDao {

    @Insert
    suspend fun insertMood(moodEntry: MoodEntry)

    @Query("SELECT * FROM mood_table ORDER BY timestamp DESC")
    fun getAllMoods() : LiveData<List<MoodEntry>>

    @Delete
    suspend fun deleteMood(moodEntry: MoodEntry)
}