



/*--------------------------------------------------------------------------------------
 Leetcode Problem No:- 1295. Find Numbers with Even Number of Digit

        Given an array nums of integers, return how many of them contain an even number of digits.
        -------------------------------------------
        Example 1:
        Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.
        -------------------------------------------------------
        Example 2:
        Input: nums = [555,901,482,1771]
        Output: 1
        Explanation:
        Only 1771 contains an even number of digits.
---------------------------------------------------------------------------------------------------*/
public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(findNum(nums));

    }

    //    Method for each element iterate
    static int findNum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //  Method for check whether a number is even or not!
    static boolean even(int nums) {
        return digit(nums) % 2 == 0;
    }

    //  Methods for check the digits of number
    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return -1;
        }
        String digitOfNum = num + "";
        return digitOfNum.length();
    }
}
