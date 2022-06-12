package com.softwr.datastructure.searchingAlgorithms

class SearchingAlgorithm {

    /**
     * In Linear search a sequential search is done for all item one by one.
     * So Every item is checked and if match is found the particular item will be returned, otherwise
     * The search will continue till end.
     * Time complexity is 0(n)
     */
    fun linearSearch(unsortedArray: Array<Int>,target:Int): Int {

        for(i in 0 until unsortedArray.size){

            if(target == i){
                return unsortedArray[i]
            }

        }

        return -1

    }

    /**
     * Binary search will cut the list in half after every iteration until find it's target.
     * We don't need to check all items all items in binary search algorithm.
     * Binary search is used on a sorted list.
     * Time complexity is 0(log n)
     */
    fun binarySearch(sortedArray: Array<Int>,target:Int) : Int{

        var first = 0
        var last = sortedArray.size -1;

        while (first <= last){

            val middle = (first + last) / 2

            if(target == middle){
                return sortedArray[middle]
            }
            else if(target > middle){
             first = middle + 1
            }
            else{
                last = middle - 1
            }

        }


        return -1
    }

}