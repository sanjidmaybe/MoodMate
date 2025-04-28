package com.sanjidmaybe.moodmate.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sanjidmaybe.moodmate.model.MoodEntry
import com.sanjidmaybe.moodmate.repository.MoodRepository
import kotlinx.coroutines.launch

class MoodViewModel(private val repository: MoodRepository) : ViewModel() {

    val allMoods: LiveData<List<MoodEntry>> = repository.allMoods

    fun insertMood(moodEntry: MoodEntry) {
        viewModelScope.launch {
            repository.insertMood(moodEntry)
        }
    }

    fun deleteMood (moodEntry: MoodEntry) {
        viewModelScope.launch {
            repository.deleteMood(moodEntry)
        }
    }

}