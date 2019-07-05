package com.tokopedia.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateSum(50, 100)
    }

    fun calculateSum(a: Int, b: Int) {
        val sum = a + b
        text_title.text = sum.toString()
    }
}
