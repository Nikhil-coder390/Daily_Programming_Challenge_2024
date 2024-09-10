/*
Problem Statement:
You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input:
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output:
Return the missing integer from the array.
Example: Missing number: 3

Constraints:
The array contains exactly n-1 distinct integers, and all integers are in the range [1, n].
You must solve the problem with a time complexity of O(n).
The space complexity should be O(1) (constant space).
1 ≤ n ≤ 10^6
*/
import java.util.*;
class Solution{
    public int missingNum(List<Integer> arr){
        int n = arr.size()+1;
        int originalSum = (n*(n+1))/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum+=num;
        }
        return originalSum-actualSum;
    }
}
class MissingNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int size = input.nextInt();
        // Test Case 1: Input: [1, 2, 4, 5]
        // Output: 3
        // Test Case 2: Input: [2, 3, 4, 5]
        // Output: 1
        // Test Case 3: Input: [1, 2, 3, 4]
        // Output: 5
        // Test Case 4: Input: [1]
        // Output: 2
        // Test Case 5: Input: [1, 2, 3, ..., 999999]
        // Output: 1000000
        for(int i=0;i<size-1;i++){
            arr.add(input.nextInt());
        }
        Solution obj = new Solution();
        System.out.println("The Missing Num is: " + obj.missingNum(arr));
        input.close();
    }
}