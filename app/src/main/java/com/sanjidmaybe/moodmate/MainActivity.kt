package com.sanjidmaybe.moodmate

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sanjidmaybe.moodmate.data.MoodDatabase
import com.sanjidmaybe.moodmate.databinding.ActivityMainBinding
import com.sanjidmaybe.moodmate.repository.MoodRepository
import com.sanjidmaybe.moodmate.viewmodel.MoodViewModel
import com.sanjidmaybe.moodmate.viewmodel.MoodViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val moodViewModel: MoodViewModel by viewModels {
        MoodViewModelFactory(MoodRepository(MoodDatabase.getDatabase(applicationContext).moodDao()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}