using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        var number = Convert.ToInt32(Console.ReadLine());
        List<string> inputStrings = new List<string>();
        for (var i = 0; i < number; i++) 
        {
            inputStrings.Add(Console.ReadLine());
        }

        var oddStr = ""; 
        var evenStr = "";
        for(var i = 0; i < number; i++) 
        {
            for(var j = 0; j < inputStrings[i].Length; j++)
            {
                if(j % 2 == 0)
                    evenStr += inputStrings[i][j];
                else 
                    oddStr += inputStrings[i][j];
            }
            Console.WriteLine(evenStr + " " + oddStr);
            oddStr = "";
            evenStr = "";
        }

    }
}