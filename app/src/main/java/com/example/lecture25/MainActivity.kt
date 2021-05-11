package com.example.lecture25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val studentList : MutableList<Student> = mutableListOf()
    val recyclerView : RecyclerView by lazy {findViewById<RecyclerView>(R.id.recycler_view)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..11) {
            studentList.add(Student("firstname $i", "secondname $i"))
        }

        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = StudentAdapter(studentList)
    }
}