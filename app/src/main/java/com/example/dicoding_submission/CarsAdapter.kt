package com.example.dicoding_submission

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicoding_submission.CarsAdapter.CarsViewHolder
import com.example.dicoding_submission.databinding.ItemCarsBinding
import kotlin.coroutines.coroutineContext

class CarsAdapter : RecyclerView.Adapter<CarsViewHolder>() {
    private var carList: List<Cars>? = null
    private lateinit var onItemCallback: OnItemClickCallback

    fun setOnItemCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemCallback = onItemClickCallback
    }

    inner class CarsViewHolder(private val binding: ItemCarsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cars: Cars?) {
            binding.cars = cars
            binding.imgCars.setVisibility(View.VISIBLE)
            Glide.with(itemView)
                .load(cars!!.img)
                .into(binding.imgCars)
            binding.executePendingBindings()
            Log.d("VHBind", "Viewholder dibind")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCarsBinding.inflate(layoutInflater, parent, false)
        Log.d("OnCreateVH", "method onCreateVH")
        return CarsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        val car = carList!![position]
        holder.bind(car)
        holder.itemView.setOnClickListener {
            (onItemCallback.onItemClicked(car).run {
                val intent = Intent(holder.itemView.context, DetailActivity::class.java)
                intent.putExtra("cars", car)
                holder.itemView.context.startActivity(intent)
            })
        }
        Log.d("AdapterBind", "method onBindVH")
    }

    override fun getItemCount(): Int {
        Log.d("itemCount", "method getItemCount, item= ${carList!!.size}")
        return if (carList != null) {
            carList!!.size
        } else {
            0
        }
    }

    fun setCarsList(carList: List<Cars>?) {
        this.carList = carList
        notifyDataSetChanged()
        Log.d("setCarList", "Method setcarlist")
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Cars)
    }

}