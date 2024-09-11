/*
Problem Statement:
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.

Input:
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output:
Return the duplicate integer present in the array.
Example: Duplicate number: 3

Constraints:
1 ≤ n ≤ 10^5.
There is only one duplicate number, but it may appear more than once.
You must not modify the array (arr) or use extra space greater than O(1).
The time complexity must be O(n).
*/
import java.util.*;
class Sol{
    public int duplicateNum(List<Integer> arr){
        int slow = arr.get(0);
        int fast = arr.get(0);
        do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        }while(slow != fast);
        fast = arr.get(0);
        while(slow!=fast){
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        return slow;
    }
}
class DuplicateNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            arr.add(input.nextInt());
        }
        Sol obj = new Sol();
        int res = obj.duplicateNum(arr);
        System.out.println("The Duplicate Number is: " + res);
        input.close();
    }
}