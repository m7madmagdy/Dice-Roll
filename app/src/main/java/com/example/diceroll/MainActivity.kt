package com.example.diceroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroll.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableResourceBundle =  when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        binding.diceImage.setImageResource(drawableResourceBundle)
    }
}