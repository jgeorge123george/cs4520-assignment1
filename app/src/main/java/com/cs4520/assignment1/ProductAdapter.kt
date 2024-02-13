package com.cs4520.assignment1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ProductAdapter(private val productList : ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.product_list_item,parent,false)
        return ProductViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentItem = productList[position]
        holder.product_name.text = currentItem.name.toString()
        if(currentItem.type == ProductType.Equipment){
            holder.product_type_image.setImageResource(R.drawable.tools)
            holder.list_item_raw_layout.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.red))
        }else{
            holder.product_type_image.setImageResource(R.drawable.food)
            holder.list_item_raw_layout.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.yellow))
        }

        holder.product_price.text = "$${currentItem.price.toString()}"
        if(currentItem.expiryDate != null) {
            holder.expirey_date.text = "Expiry : ${currentItem.expiryDate.toString()}"
        }else{
            holder.expirey_date.text = ""
        }

    }


    class ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        val product_name : TextView = itemView.findViewById(R.id.product_name)
        val product_type_image : ShapeableImageView = itemView.findViewById(R.id.product_type_image)
        val product_price : TextView = itemView.findViewById(R.id.product_price)
        val expirey_date : TextView =  itemView.findViewById(R.id.expiry_date)
        val list_item_raw_layout : ConstraintLayout =  itemView.findViewById(R.id.list_item_raw_layout)





    }
}