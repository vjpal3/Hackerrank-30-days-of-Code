using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, string s) 
    {
        bool isSeaLevel = true;
        var sumAltitude = 0;
        var countOfValleys = 0;
        foreach (char c in s) {
            if(c == 'U') 
                sumAltitude +=1;
            
            if(c == 'D') 
                sumAltitude -=1;

            if(sumAltitude == 0 ) 
                isSeaLevel = true;

            if(sumAltitude < 0 && isSeaLevel ) 
            {
                isSeaLevel = false;
                countOfValleys++;
            }
        }
        return countOfValleys;
    }

    static void Main(string[] args) 
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        string s = Console.ReadLine();

        int result = countingValleys(n, s);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
