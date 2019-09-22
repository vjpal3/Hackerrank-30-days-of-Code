using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) 
    {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] a_temp = Console.ReadLine().Split(' ');
        int[] a = Array.ConvertAll(a_temp,Int32.Parse);
        // Write Your Code Here

        int totalSwaps = 0;
        for(var i = 0; i < n; i++) 
        {
            int numberOfSwaps = 0;
            for(var j = 0; j < n-1; j++) 
            {
                if(a[j] > a[j+1]) 
                {
                    var temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    totalSwaps++;
                    numberOfSwaps++;
                }
            }
            if(numberOfSwaps == 0)
                break;
        }
        Console.WriteLine("Array is sorted in {0} swaps.", totalSwaps);
        Console.WriteLine("First Element: " + a[0]);
        Console.WriteLine("Last Element: " + a[n-1]);
    }
}

