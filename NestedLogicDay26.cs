using System;
using System.Collections.Generic;
using System.IO;

/* 
Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). 
The fee structure is as follows:
If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
*/

class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */

        string[] a_temp = Console.ReadLine().Split(' ');
        int[] actual = Array.ConvertAll(a_temp, Int32.Parse);

        string[] e_temp = Console.ReadLine().Split(' ');
        int[] expected = Array.ConvertAll(e_temp, Int32.Parse);

        int year_diff = actual[2] - expected[2];
        int month_diff = actual[1] - expected[1];
        int day_diff = actual[0] - expected[0];

        if(year_diff <= 0) {
            if(month_diff <= 0) {
                if(day_diff <= 0) {
                    Console.WriteLine(0);
                }
                else {
                    Console.WriteLine(15 * day_diff);
                }
            }
            else {
                Console.WriteLine(500 * month_diff);
            }
        }
        else 
            Console.WriteLine(10000);       
    }
}
