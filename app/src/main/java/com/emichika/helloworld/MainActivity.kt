package com.emichika.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 必須なので気にしない start
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // 必須なので気にしない end

        // greetingText の要素を取得
        val greetingText: TextView = findViewById(R.id.greetingText)

        // morningBtn の要素を取得
        val morningBtn: Button = findViewById(R.id.morningBtn)
        // morningBtn の click 検知
        morningBtn.setOnClickListener {
            // text 要素にプロパティ値を設定
            greetingText.text = getString(R.string.good_morning_text)
        }

        // afternoonBtn の要素を取得
        val afternoonBtn: Button = findViewById(R.id.afternoonBtn)
        // afternoonBtn の click 検知
        afternoonBtn.setOnClickListener {
            // text 要素にプロパティ値を設定
            greetingText.text = getString(R.string.good_afternoon_text)
        }

        // eveningBtn の要素を取得
        val eveningBtn: Button = findViewById(R.id.eveningBtn)
        // eveningBtn の click 検知
        eveningBtn.setOnClickListener {
            // text 要素にプロパティ値を設定
            greetingText.text = getString(R.string.good_evening_text)
        }
    }
}