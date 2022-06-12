package com.softwr.datastructure.arrays

class SortingArray(array: Array<Int>) {

    var array: Array<Int> = array

    init {
        sorting()
    }


    private fun sorting() {
        var temp = 0;

        //Displaying elements of original array
        println("Elements of original array: ")
        for (element in array) {
            print("$element ")
        }

        //Sort the array in ascending order
        for (i in 0 until array.size) {

            for (j in i + 1 until array.size) {

                if (array[i] > array[j]) {

                    temp = array[i]
                    array[i] = array[j]
                    array[j] = temp

                }


            }

            println()
            //Displaying elements of array after sorting
            println("Elements of array sorted in ascending order: ")
            for (element in array) {
                print("$element ")
            }

        }



    }
}