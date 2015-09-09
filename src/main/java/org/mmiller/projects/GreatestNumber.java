/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g2llc.pmm.storm.etl.util;

/**
 *
 * @author Maury Miller
 */
public class GreatestNumber {
    private static final int[] table = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    
    public static int integerLength(int value) {
        for (int i = 0; ; i++) {
            if (value <= table[i]) {
                return i+1;
            }
        }
    }
    
    public static void main(String[] args) {
       int input = Integer.valueOf(args[0]);
       int max = greatestNumber(input);
       int reverse = reverse(input);
       
       System.out.println("Maximum number: " + max);
       System.out.println("Reverse: " + reverse);
    }
    
    public static int greatestNumber(int value) {
        if (value < 1) {
            return -1;
        }
        
        int max = 0;
        int length = 0;
        int[] digits = new int[10];
        int number = value;

        while (number > 0) {
            ++digits[number % 10];
            number /= 10;
            length++;
        }
        
        int multiplier = (int) Math.pow(10, length - 1);
        
        for (int digit = 9; digit >= 0; digit--) {
            
            int temp = digits[digit];
            while (temp > 0) {
                max = max + digit * multiplier;
                multiplier /= 10;
                temp--;
            }
        }

        return max;
    }
    
    /**
     * 
     * @param value
     * @return 
     */
    private static int reverse(int value) {
        if (value < 1) {
            return -1;
        }
        
        int number = value;
        int result = 0;
        
        while (number > 0) {
            result *= 10;
            result = result + number % 10;
            number /= 10;
        }
        
        return result;
    }
    
    private static void insertionSort(int[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;

            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = newValue;
        }
    }
    
}
