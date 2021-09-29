package com.android1.android2_hw_start_kotlin

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Data()

        val text = findViewById<TextView>(R.id.textViewActivity)
        val button = findViewById<Button>(R.id.btnActivity)
        text.text = "Date: ${data.whenIllFoundDeveloperJob.year}" +
                "/${data.whenIllFoundDeveloperJob.month}" +
                "/${data.whenIllFoundDeveloperJob.date}," +
                " Salary: ${data.howMuchMoneyWillIEarn}"

        button.setOnClickListener {
            Toast.makeText(this, "Date: ${data.whenIllFoundDeveloperJob}, " +
                    "Salary: ${data.howMuchMoneyWillIEarn}", Toast.LENGTH_SHORT).show()
        }

        text.append("\nBoss: ${Boss.bossName}")

        text.append("\nУгадай наибольшее число: ")

        for(i in Arrays.firstArray) {
            text.append("$i ")
            println(i)
        }

    }

    companion object Boss { // статика
        private var bossName: String = "Dmitriy Dobrie Bulki"
    }

    object Arrays { // синглтон

        const val size = 4 //const - скомпилировано на этапе компиляции, а не выполнения программы
        val firstArray = arrayOf(1, 2, 3, 4)
        val secondArray = Array(size) {1}

        fun getData() {
            Arrays
        }

    }
}

// Задание к 1 лекции (Android 2, Kotlin)
/* ✓ 1. Создать новый проект в Android Studio без поддержки Kotlin.
   ✓ 2. Сконфигурировать Kotlin в новом проекте (лучше вручную).
   ✓ 3. Перевести MainActivity на Kotlin.
   ✓ 4. Добавить кнопку в разметку и повесить на неё clickListener в Activity.
   5. Потренироваться в создании классов и функций, описанных в уроке, и убедиться, что всё
   работает. Например, создать тестовое приложение:
       ✓ a. Сформировать data class с двумя свойствами и вывести их на экран приложения.
       ✓ b. Создать Object. В Object вызвать copy и вывести значения скопированного класса на
       экран.
       ✓ c. Вывести значения из разных циклов в консоль, используя примеры из методических
       материалов.
   6. Изучить API погоды «Яндекса», посмотреть примеры и зарегистрироваться в качестве
   разработчика, получить свой ключ разработчика.
   7. Изучить API базы данных с фильмами и зарегистрироваться в качестве разработчика,
   получить свой ключ разработчика.
   8. Определиться с экранами и инструментарием своего будущего приложения с фильмами на
   основе возможностей API. */
// Serega, sure