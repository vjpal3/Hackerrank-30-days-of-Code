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

        string[] r_temp = Console.ReadLine().Split(' ');
        int[] returned = Array.ConvertAll(r_temp, Int32.Parse);
        int return_day = returned[0];
        int return_month = returned[1];
        int return_year = returned[2];

        string[] d_temp = Console.ReadLine().Split(' ');
        int[] due = Array.ConvertAll(d_temp, Int32.Parse);
        int due_day =  due[0];
        int due_month = due[1];
        int due_year = due[2];

        int fine = 0;
        if (return_year == due_year)
        {
            if (return_month == due_month)
            {
                if (return_day > due_day)
                {
                    fine = 15 * (return_day - due_day);
                }
            }
            else if (return_month > due_month)
            {
                fine = 500 * (return_month - due_month);
            }
        }
        else if (return_year > due_year)
        {
            fine = 10000;
        }
        Console.WriteLine(fine);
    }
}

