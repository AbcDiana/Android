package com.abcdiane.motormaticmurah.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.abcdiane.motormaticmurah.R
import com.abcdiane.motormaticmurah.model.Motor
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMotorAdapter(private val listMotor: ArrayList<Motor>) :
    RecyclerView.Adapter<ListMotorAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item_motor, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val motor = listMotor[position]

        Glide.with(holder.itemView.context)
            .load(motor.photo)
            .apply(RequestOptions().override(90, 100))
            .into(holder.imgPhoto)

        holder.tvName.text = motor.name
        holder.tvPrice.text = motor.price
        holder.tvDetail.text = motor.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listMotor[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listMotor.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_motor)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Motor)
    }
}