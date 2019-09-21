using System;
using System.Linq;

class Difference {
    private int[] elements;
    public int maximumDifference;

	// Add your code here
    public Difference(int[] arr) {
        elements = arr;
    }

    public void computeDifference() {
        var max = elements[0];
        var min = elements[0];
        for(var i=1; i < elements.Length; i++) {
            if(elements[i] > max)
                max = elements[i];
            else if(elements[i] < min)
                min = elements[i];
            var tempResult = max - min;
            if(tempResult > maximumDifference)
                maximumDifference = tempResult;
        }
    }
} 