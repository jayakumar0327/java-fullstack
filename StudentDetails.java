// Student.java
public class Student {
    // Student details
    private int studentId;
    private String studentName;
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;

    // Constructor to initialize student details
    public Student(int studentId, String studentName, int subject1, int subject2, int subject3, int subject4, int subject5) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSubject1() {
        return subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public int getSubject4() {
        return subject4;
    }

    public int getSubject5() {
        return subject5;
    }
}

// StudentDetails.java
public class StudentDetails {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(101, "John Doe", 85, 90, 78, 88, 92);

        // Calculating the sum of marks
        int sum = student.getSubject1() + student.getSubject2() + student.getSubject3() + student.getSubject4() + student.getSubject5();

        // Calculating the average of marks
        double average = sum / 5.0;

        // Displaying the results
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Sum of Marks: " + sum);
        System.out.println("Average of Marks: " + average);
    }
}