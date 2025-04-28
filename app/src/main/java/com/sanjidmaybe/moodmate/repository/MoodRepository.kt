package com.sanjidmaybe.moodmate.repository

import androidx.lifecycle.LiveData
import com.sanjidmaybe.moodmate.data.MoodDao
import com.sanjidmaybe.moodmate.model.MoodEntry

class MoodRepository(private val moodDao: MoodDao) {

    val allMoods: LiveData<List<MoodEntry>> = moodDao.getAllMoods()

    suspend fun insertMood( moodEntry: MoodEntry) {
        moodDao.insertMood(moodEntry)
    }

    suspend fun deleteMood( moodEntry: MoodEntry) {
        moodDao.deleteMood(moodEntry)
    }
}