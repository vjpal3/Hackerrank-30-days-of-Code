public class MissingGradeException extends Exception {
    private int studentId;
    
    public int getStudentId() {
        return studentId;
    }
    
    public MissingGradeException(int studentId) {
        super("Missing grades for StudentId: " + studentId);
        this.studentId = studentId;
    }
}