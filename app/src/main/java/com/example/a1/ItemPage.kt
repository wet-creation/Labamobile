package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a1.constants.Constants
import kotlinx.android.synthetic.main.activity_item_page.*

class ItemPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_page)
        imgItem.setImageResource(intent.getIntExtra(Constants.IMG_ITEM,0))

        tvName.text = intent.getStringExtra(Constants.TV_NAME)
        tvSex.text = intent.getStringExtra(Constants.TV_SEX)
        tvAge.text = intent.getStringExtra(Constants.TV_AGE)
        tvDescription.text = intent.getStringExtra(Constants.TV_DESCRIPTION)

    }

}