package com.softwr.datastructure.arrays

import java.util.*

class ReverseArray(array: Array<Int>) {

    var array : Array<Int> = array

    init {
        reverse()
    }

    private fun reverse(){
        printOrignalArray()

        val size = array.size
        val temArray = IntArray(size)
        var j = size

        for (i in 0 until size) {
            temArray[size - 1] = array[i]
            j = j - 1
        }


        println("Reversed array is: \n")
        for(k in 0 until size){
            println("Reversed array is:" + temArray[k])
        }

    }

    //Printing the Original array
    private fun printOrignalArray(){
        println("Original array is: \n")
        for(i in array.indices){
            println("Reversed array is:" + array[i])
        }
    }
}