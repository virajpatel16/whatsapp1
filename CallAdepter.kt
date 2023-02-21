package com.example.whatsapp.app

import android.content.Context
import android.provider.ContactsContract.Contacts.Photo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class CallAdepter(arrayList: ArrayList<Calldata>) : RecyclerView.Adapter<CallAdepter.CallHolder>() {

    var calllist=arrayList
    lateinit var context:Context
    class CallHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var photo=itemView.findViewById<CircleImageView>(R.id.photo)
        var callname=itemView.findViewById<TextView>(R.id.callname)
        var aerrow=itemView.findViewById<ImageButton>(R.id.aerrow)
        var late=itemView.findViewById<TextView>(R.id.late)
        var voicecall=itemView.findViewById<ImageButton>(R.id.voicecall)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallAdepter.CallHolder {
       context=parent.context

        return CallHolder(LayoutInflater.from(parent.context).inflate(R.layout.call,parent,false))

    }
    override fun getItemCount(): Int {
        return calllist.size
    }

    override fun onBindViewHolder(holder: CallAdepter.CallHolder, position: Int) {

        holder.callname.text=calllist.get(position).callname
        holder.late.text=calllist.get(position).late

        Glide.with(context).load(calllist.get(position).photo).into(holder.photo)
        Glide.with(context).load(calllist.get(position).aerrow).into(holder.aerrow)
        Glide.with(context).load(calllist.get(position).voicecall).into(holder.voicecall)

    }



}
