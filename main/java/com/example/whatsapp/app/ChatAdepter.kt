package com.example.whatsapp.app

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.whatsapp.R

import de.hdodenhof.circleimageview.CircleImageView

class ChatAdepter(arrayList: ArrayList<Chatdata>) : RecyclerView.Adapter<ChatAdepter.Chatholder>() {

    var chatList = arrayList
    lateinit var context:Context


    class Chatholder(itemView: View) : ViewHolder(itemView){

  var profile=itemView.findViewById<CircleImageView>(R.id.profile)
  var name=itemView.findViewById<TextView>(R.id.name)
  var msg =itemView.findViewById<TextView>(R.id.msg)
  var Time=itemView.findViewById<TextView>(R.id.Time)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Chatholder {
    context=parent.context

        return Chatholder(LayoutInflater.from(parent.context).inflate(R.layout.chatrecycle,parent,false))
    }

    override fun getItemCount(): Int {

        return chatList.size

    }

    override fun onBindViewHolder(holder: Chatholder, position: Int) {

        holder.name.text=chatList.get(position).name
        holder.msg.text=chatList.get(position).msg
        holder.Time.text=chatList.get(position).Time

        Glide.with(context).load(chatList.get(position).profile).into(holder.profile)
    }
}


