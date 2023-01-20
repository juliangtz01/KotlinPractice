package com.example.myfirstapp

fun main(args:Array<String>)
{
//    println("Hello World!")

    // to create a variable it is similar to how you create a variable in javascript, the only difference is that if you can assign the variable type after the variable name with : (Int, String, Boolean, Float)
    var age = 29

    var candy:String = "Fun Dip"

    // using math logic
    val pi = 3.14 //use val to declare a constant/final variable
    var radius = 5
    var c = pi * radius * 2

//    println(c)

    // if statements and booleans
    var isTheLightOn = true

    if(isTheLightOn)
    {
        println("Walk across the room")
    }
    else
    {
        println("Turn on the light")
    }

    // List and Arrays
//    var topCandy = listOf("Fun Dip", "Snickers", "100 Grand Bar")
//    var topCandy = arrayOf("Fun Dip", "Snickers", "100 Grand Bar")

    println()

    // MutableList allows to expand the array something that cannot be done when using a Array
    var topCandy = mutableListOf("Fun Dip", "Snickers", "100 Grand Bar")

    // inside the parentheses first indicate the index of where you plan on adding the new item, followed by the item that is being added
    topCandy.add(0,"Black Thunder")

    // Using For Loops
    for(x in 1..100)
    {
//        println(x)
    }

    for(candy in topCandy)
    {
        println(candy)
    }

    println()

    for(x in 0 .. topCandy.size-1)
    {
        println(topCandy[x])
    }




}