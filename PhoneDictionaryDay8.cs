using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */

        var n = Convert.ToInt32(Console.ReadLine());
        var phoneBook = new Dictionary<string, int>();
        
        for (var i = 0; i < n; i++) 
        {
            var input = (Console.ReadLine()).Split(' ');
            phoneBook.Add(input[0], Convert.ToInt32(input[1]));
        }

        while(true)
        {
            var query = Console.ReadLine();
            if(String.IsNullOrWhiteSpace(query))
                break;

            if(phoneBook.ContainsKey(query))
                Console.WriteLine(query + "=" + phoneBook[query]);
            else
                Console.WriteLine("Not found");
        }
    }
}