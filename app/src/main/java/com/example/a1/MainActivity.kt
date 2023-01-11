package com.example.a1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a1.adapter.ItemsAdapter
import com.example.a1.model.Items
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val itemsList : MutableList<Items> = mutableListOf()
    private lateinit var itemsAdapter : ItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setDefaultNightMode(MODE_NIGHT_NO)
        itemsList.add(Items(
            1,
            "dog1",
            "Banjo",
            "male",
            "4",
            "Cute little dog"

        ))
        itemsList.add(Items(
            2,
            "dog2",
            "Steffi",
            "female",
            "9",
            "She is waiting for you!"

        ))
        itemsList.add(Items(
            3,
            "dog3",
            "Levy",
            "male",
            "2",
            "Cute little dog"

        ))
        itemsList.add(Items(
            4,
            "dog4",
            "Archibald",
            "male",
            "6",
            "He is waiting for you!"

        ))
        itemsList.add(Items(
            5,
            "dog5",
            "Alva",
            "female",
            "7",
            "Cute and friendly dog"

        ))
        itemsList.add(Items(
            6,
            "dog6",
            "Bingo",
            "female",
            "11",
            "Bingo likes humans and his toy ball"

        ))
        itemsList.add(Items(
            7,
            "dog7",
            "Berty",
            "female",
            "4",
            "This little prince is looking for new owner"

        ))
        itemsList.add(Items(
            8,
            "dog8",
            "Beast",
            "male",
            "7",
            "Angry but cute doggy)"

        ))


        setCourseRecycler(itemsList)

    }

    private fun setCourseRecycler(categoryList: MutableList<Items>) {
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        itemsRecycler.layoutManager = layoutManager
        itemsAdapter = ItemsAdapter(this,categoryList)
        itemsRecycler.adapter = itemsAdapter
    }

}