package com.example.lecture25

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val studentList : List<Student>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        )
    }

    override fun getItemCount() = studentList.size

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.firstName.text = studentList[position].firstName
        holder.secondName.text = studentList[position].secondName
    }

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName : TextView = itemView.findViewById(R.id.first_name)
        val secondName : TextView = itemView.findViewById(R.id.second_name)
    }
}