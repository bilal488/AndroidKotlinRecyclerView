package com.technohem.androidkotlinrecyclerview

class Product
{
    var name:String
    var price:Int
    // int to get photo from drawable folder
    var photo:Int

    constructor(name: String, price: Int, photo: Int)
    {
        this.name = name
        this.price = price
        this.photo = photo
    }
}