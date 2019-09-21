using System;

class Solution {

    static void Main(String[] args) {
        string S = Console.ReadLine();

        try 
        {
            int result = Int32.Parse(S);
            Console.WriteLine(result);
        }
        catch (FormatException)
        {
            Console.WriteLine("Bad String");
        }
    }
}

