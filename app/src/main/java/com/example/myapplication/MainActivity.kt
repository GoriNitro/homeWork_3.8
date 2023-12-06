package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.character.CharactersFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupFragments()
    }

    private fun setupFragments() {
        supportFragmentManager.beginTransaction()
            .add(R.id.container, CharactersFragment())
            .commit()
    }
}