package com.tokopedia.training

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_title.text = getString(R.string.greeting_new)

        image_view.setImageResource(R.drawable.ic_launcher_foreground)

        Glide.with(this)
            .load("http://pngimg.com/uploads/android_logo/android_logo_PNG32.png")
            .into(image_view)

        button_calculate.setOnClickListener {
            if (!TextUtils.isEmpty(number_1.text) && !TextUtils.isEmpty(number_2.text)) {
                calculateSum(number_1.text.toString().toInt(), number_2.text.toString().toInt())
            }
        }

    }

    fun calculateSum(a: Int, b: Int) {
        val sum = a + b
        text_result.text = sum.toString()
    }
}
