class Solution {
    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        
        var list = new List<int>();
        while(n > 0) 
        {
            list.Add(n % 2);
            n = n / 2;
        }
        var count = 0;
        var maxCount = 0;
        for(var i = 0; i < list.Count; i++) 
        {
            if(list[i] == 1)
                count++;
            else
                count = 0;
                
            maxCount = Math.Max(count, maxCount);        
        }
        Console.WriteLine(maxCount);
    }
}