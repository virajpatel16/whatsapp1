package com.example.whatsapp.app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdepter(arrayList: ArrayList<Statusdata>) : RecyclerView.Adapter<StatusAdepter.StatusHolder>() {

    var statuslist=arrayList
    lateinit var context:Context

    class StatusHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var status=itemView.findViewById<CircleImageView>(R.id.status)
        var statusname=itemView.findViewById<TextView>(R.id.statusname)
        var date=itemView.findViewById<TextView>(R.id.date)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):StatusHolder {

   context =parent.context
        return StatusHolder(LayoutInflater.from(parent.context).inflate(R.layout.status,parent,false))
    }
    override fun getItemCount(): Int {
       return statuslist.size
    }
    override fun onBindViewHolder(holder:StatusHolder , position: Int) {
        holder.statusname.text=statuslist.get(position).statusname
        holder.date.text=statuslist.get(position).date

        Glide.with(context).load(statuslist.get(position).status).into(holder.status)
    }
}
