package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now do for rest of the algorithm...................below

        //Insertion Sorting
        sort.insertionSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Insertion sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
        }

        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Bubble sort array is not sorted!");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Merge Sorting
        sort.mergeSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Merge sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
        }

        //Quick Sorting
        //sort.quickSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Quick sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
    }

        //Heap Sorting
        sort.heapSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Heap sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
        }

        //Bucket Sorting
        sort.bucketSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Bucket sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
        }

        //Get Max
        sort.getMax(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Quick sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
        }

        //Shell Sorting
        sort.shellSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Quick sort array is not sorted!");
        }catch (Exception ex){
            ex.getMessage();
        }
    }
}




