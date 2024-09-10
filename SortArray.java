/*
Problem: Sort an Array of 0s, 1s, and 2s
You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.

Input :
An integer array arr of size n where each element is either 0, 1, or 2.
Example : arr = [0, 1, 2, 1, 0, 2, 1, 0]

Output :
The sorted array, arranged in increasing order of 0s, 1s, and 2s.
Example: [0, 0, 0, 1, 1, 1, 2, 2]

Solution:
Brute Force Method
Time Complexity : O(n^2)
import java.util.*;
class Result{
    public int[] sortArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
class SortArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Size of array
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt(); // Read array elements
        }
        Result obj = new Result();
        obj.sortArrays(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/

// Dutch National Flag Algorithm
// Time Complexity : O(n)

import java.util.*;
class Result{
    public List<Integer> sortArrays(List<Integer> arr){
        /*
         * low represents the position for 0's
         * mid is used to traverse through the elements
         * high represents the position for 2's
         */
        int low = 0, mid = 0, high = arr.size()-1;
        while(mid<=high){//Traversing through the array
            switch (arr.get(mid)){
                case 0:
                    Collections.swap(arr,low++,mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    Collections.swap(arr, mid, high--);
                    break;
                default: break;
            }
        }
        return arr;
    }
}
class SortArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        int n = input.nextInt(); // Size of array
        for(int i=0;i<n;i++){
            arr.add(input.nextInt()); // Read array elements
        }
        Result obj = new Result();
        obj.sortArrays(arr);
        System.out.println("Sorted Array : " + arr);
        input.close();
    }
}