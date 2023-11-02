package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lemonade.adapter.AffirmationAdapter
import com.example.lemonade.adapter.DogAdapter
import com.example.lemonade.data.DataSource
import com.example.lemonade.data.DogDataSource

class DogApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_app)

        val recycleView = findViewById<RecyclerView>(R.id.recycle_view_dog)
        val myDataSource = DogDataSource().loadDog()
        val myAdapter = DogAdapter(this, myDataSource)

        recycleView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)

        recycleView.adapter = myAdapter
    }
}