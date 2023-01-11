package com.example.a1.adapter

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.util.Pair
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.a1.ItemPage
import com.example.a1.R
import com.example.a1.constants.Constants
import com.example.a1.model.Items
import kotlinx.android.synthetic.main.item.view.*

class ItemsAdapter(private val context: Context, private val items: MutableList<Items>)
    : Adapter<ItemsAdapter.Companion.CourseViewHolder>() {
    companion object{
        class CourseViewHolder(itemView: View) : ViewHolder(itemView){
            var itemName: TextView? = itemView.tvName
            var itemImg: ImageView? = itemView.imgItem
            var itemSex: TextView? = itemView.tvSex

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val courseItems:View = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return CourseViewHolder(courseItems)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val imageId :Int = context.resources.getIdentifier("ic_"+items.elementAt(position).img,"drawable",context.packageName)

        holder.itemName?.text = items.elementAt(position).name
        holder.itemImg?.setImageResource(imageId)
        holder.itemSex?.text = items.elementAt(position).sex

        holder.itemView.setOnClickListener{
            val intent = Intent(context, ItemPage::class.java)

            val options = ActivityOptions.makeSceneTransitionAnimation(context as Activity,
                Pair(holder.itemImg,"courseImage")
            )
            intent.putExtra(Constants.IMG_ITEM,imageId)
            intent.putExtra(Constants.TV_NAME,items.elementAt(position).name)
            intent.putExtra(Constants.TV_SEX,items.elementAt(position).sex)
            intent.putExtra(Constants.TV_AGE,items.elementAt(position).age)
            intent.putExtra(Constants.TV_DESCRIPTION,items.elementAt(position).description)





            context.startActivity(intent,options.toBundle())
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
}