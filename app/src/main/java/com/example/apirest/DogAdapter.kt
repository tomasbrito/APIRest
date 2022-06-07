package com.example.apirest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DogAdapter(val images : List<String>, var context: Context): RecyclerView.Adapter<DogAdapter.DogsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dog, parent, false)
        return (DogsHolder(view))
    }

    override fun onBindViewHolder(holder: DogsHolder, position: Int) {
        Glide
            .with(context)
            .load(images[position])
            .into(holder.getImageView())
    }

    override fun getItemCount(): Int {
        return images.size
    }



    class DogsHolder(v:View): RecyclerView.ViewHolder(v){
        private var view : View

        init {
            this.view = v
        }

        fun getImageView(): ImageView {
            return view.findViewById(R.id.ivDog)
        }

    }


}