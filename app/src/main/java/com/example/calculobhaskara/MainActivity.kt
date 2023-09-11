package com.example.calculobhaskara

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculobhaskara.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalcular.setOnClickListener{
            val num1: Double = binding.valorA.text.toString().toDouble()
            val num2: Double = binding.valorB.text.toString().toDouble()
            val num3: Double = binding.valorC.text.toString().toDouble()
            val discriminante = num2 * num2 - 4 * num1 *num3

            val num1Int = num1.toInt()
            val num2Int = num2.toInt()
            val num3Int = num3.toInt()
            val discriminanteInt = discriminante.toInt()

            binding.resultA.text = "Δ = $num2Int² - 4.$num1Int.$num3Int"
            binding.resultC.text = "Δ = $discriminanteInt"
        }
    }
}