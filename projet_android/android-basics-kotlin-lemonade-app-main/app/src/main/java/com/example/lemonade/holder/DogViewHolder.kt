package com.example.lemonade.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lemonade.R

class DogViewHolder(private  val view: View) : RecyclerView.ViewHolder(view){
    val dog_name = view.findViewById<TextView>(R.id.dog_name)
    val dog_age = view.findViewById<TextView>(R.id.dog_age)
    val dog_hobby = view.findViewById<TextView>(R.id.dog_hobby)
    val imageView = view.findViewById<ImageView>(R.id.item_image)
}