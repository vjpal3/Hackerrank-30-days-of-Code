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

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        if (n == c.Length)
            return 0;
        
        int[] arr = new int[n - c.Length];
        var maxDistance = 0;
        int index = 0;
        for(var j = 1; j <= n; j++ ) {
            for (var i = 0; i < c.Length; i++) {
                if(j == c[i]) {
                    continue;
                }

                var distance = Math.Abs(j - c[i]);
                if(distance > maxDistance)
                    maxDistance = distance;
            }
            arr[index] = maxDistance;
            index++;
        }

        maxDistance = 0;
        for(var i = 0; i < arr.Length; i++) {
            if(arr[i] > maxDistance) 
                maxDistance = arr[i];
        }

        return maxDistance;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string[] nm = Console.ReadLine().Split(' ');

        int n = Convert.ToInt32(nm[0]);

        int m = Convert.ToInt32(nm[1]);

        int[] c = Array.ConvertAll(Console.ReadLine().Split(' '), cTemp => Convert.ToInt32(cTemp))
        ;
        int result = flatlandSpaceStations(n, c);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
