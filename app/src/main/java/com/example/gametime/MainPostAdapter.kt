package com.example.gametime

import android.icu.text.CaseMap
import android.service.autofill.TextValueSanitizer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gametime.model.MainPosts

class MainPostAdapter (val MainPostsList: MutableList<MainPosts>): RecyclerView.Adapter<MainPostAdapter.MainPostsViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainPostsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mainpost_single_item, parent, false)

        return MainPostsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainPostsViewHolder, position: Int) {
        var title = MainPostsList[position].Title
        val content = MainPostsList[position].Content
        holder.Title.text = title
        holder.Content.text = content
        holder.picture.setImageResource(MainPostsList[position].Picture)



        }
    class MainPostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var Title : TextView
        var Content : TextView
        var picture: ImageView

        init {

            Title = itemView.findViewById(R.id.MainPostTitle)
            Content = itemView.findViewById(R.id.MainPostDescription)
            picture = itemView.findViewById(R.id.MainPostPicture)

        }


    }

    override fun getItemCount() = MainPostsList.size


}