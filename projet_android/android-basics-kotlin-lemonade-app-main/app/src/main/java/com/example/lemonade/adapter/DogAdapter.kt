package com.example.lemonade.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.model.Dog
import com.example.lemonade.R
import com.example.lemonade.holder.AffirmationViewHolder
import com.example.lemonade.holder.DogViewHolder
import com.example.lemonade.model.Affirmation

class DogAdapter(private val context : Context, private val dataset : MutableList<Dog>) : RecyclerView.Adapter<DogViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.dog_item,parent, false)
        return DogViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
       return dataset.size
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.imageView.setImageResource(dataset[position].drawResDog)
        holder.dog_name.text = dataset[position].dogName
        holder.dog_age.text = dataset[position].dogAge
        holder.dog_hobby.text = dataset[position].dogHobby
       /* holder.cardview.setOnclickListener{
            Toast.makeText(holder.cardview.context,"salut",Toast.LENGTH_SHORT).show()
        }*/
    }


}