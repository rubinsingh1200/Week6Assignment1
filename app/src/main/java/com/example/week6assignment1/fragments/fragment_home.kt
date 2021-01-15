package com.example.week6assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6assignment1.R
import com.example.week6assignment1.Storage
import com.example.week6assignment1.adapter.StudentDisplay_Adapter

class fragment_home : Fragment() {
    private lateinit var rvStudents : RecyclerView
    private var storage =  Storage()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        rvStudents = view.findViewById(R.id.rvStudents)
        loadStudentAdapter()

        return view
    }

    private fun loadStudentAdapter() {
        val arr = storage.returnStudent()
        val adapter = StudentDisplay_Adapter(arr, this)
        rvStudents.layoutManager = LinearLayoutManager(view?.context, LinearLayoutManager.VERTICAL, false)
        rvStudents.adapter = adapter
    }
}