package com.softwr.datastructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softwr.datastructure.arrays.ReverseArray
import com.softwr.datastructure.arrays.SortingArray
import com.softwr.datastructure.searchingAlgorithms.SearchingAlgorithm

class MainActivity : AppCompatActivity() {

    private val sortedArray = arrayOf(10,20,30,40,50)
    private val unsortedArray = arrayOf(45,20,70,100,200,50)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchingAlgorithm = SearchingAlgorithm()
        println("Using Linear search the item found is : "+ searchingAlgorithm.linearSearch(unsortedArray,5))
        println("Using Binary search the item found is : "+ searchingAlgorithm.binarySearch(sortedArray,2))


        val reverseArray = ReverseArray(sortedArray)
        val sortingArray = SortingArray(unsortedArray)
    }
}