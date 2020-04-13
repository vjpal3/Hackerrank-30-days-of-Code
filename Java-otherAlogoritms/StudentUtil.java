import java.util.List;
import java.util.ArrayList;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code
        double[] gpa = new double [studentIdList.length];
        
        int i = 0;
        for (char[] grades : studentsGrades) {
           
            double sumOfGrades = 0.0;

            for(char grade : grades) {
                switch(grade) {
                    case 'A':
                        sumOfGrades += 4;
                        break;       
                    case 'B': 
                        sumOfGrades += 3;
                        break;
                    case 'C' : 
                        sumOfGrades += 2;
                        break;
                }
            }
            gpa[i++] = sumOfGrades/grades.length;
        }
        return gpa;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // your code
        if (lower < 0.0 || higher < 0.0 || lower > higher) {
            return null;
        }
        
        double[] gpaAry = calculateGPA(studentIdList, studentsGrades);
        
        List<Integer> gpaInRangeList = new ArrayList<>();
        
        for(int i=0; i < gpaAry.length; i++) {
            if(lower <= gpaAry[i] &&  gpaAry[i] <= higher) {
                gpaInRangeList.add(studentIdList[i]);
            }
        }
        
        // Convert into an int[]
        int[] gpaInRange = new int[gpaInRangeList.size()];
        int i = 0;
        
        for ( Integer gpa : gpaInRangeList) {
            gpaInRange[i++] = gpa;
        }
        
        return gpaInRange;
    }
}