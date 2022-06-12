package com.softwr.datastructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softwr.datastructure.searchingAlgorithms.SearchingAlgorithm

class MainActivity : AppCompatActivity() {

    private val sortedArray = arrayOf(10,20,30,40,50,60,70)
    private val unsortedArray = arrayOf(20,43,77,100,200,50)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchingAlgorithm = SearchingAlgorithm()
        System.out.println("Using Linear search the item found is : "+ searchingAlgorithm.linearSearch(unsortedArray,5))
        System.out.println("Using Binary search the item found is : "+ searchingAlgorithm.binarySearch(sortedArray,2))

    }
}