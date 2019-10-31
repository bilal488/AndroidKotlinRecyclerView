package com.technohem.androidkotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        var list = ArrayList<Product> ()
        list.add(Product("Coke",3,R.drawable.coke))
        list.add(Product("Pepsi",5,R.drawable.pepsi))
        list.add(Product("Sprite",4,R.drawable.sprite))

        // set display odf recycler view
        var adp = ProductAdapter(this,list)
        rv_pro.layoutManager = LinearLayoutManager(this)
        rv_pro.adapter = adp
    }
}
