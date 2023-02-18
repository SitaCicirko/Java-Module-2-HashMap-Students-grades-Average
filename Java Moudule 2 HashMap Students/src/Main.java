import java.util.*;
import java.lang.*;
class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName);
    }
    public String toString() {
        return firstName + " " + lastName;
    }
}
class GradesList {
    Double grade1;
    Double grade2;
    Double grade3;
    Double grade4;
    public GradesList(Double grade1, Double grade2 , Double grade3, Double grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }
    public String toString() {
        return grade1 + " " + grade2 + " " + grade3 + " " + grade4;
    }
}
class HashMapLoopAndConditions {
    public static void main (String[] args){
        Student student1 = new Student("Arek", "Kaa ");
        Student student2 = new Student("Sławek", "Baa ");
        Student student3 = new Student("Piotruś", "Graa ");
        Student student4 = new Student("Szawełek", "Klii ");

        GradesList grade1 = new GradesList(5.5, 2.4, 5.0, 3.5);
        GradesList grade2 = new GradesList(5.0, 3.5, 5.5, 4.5);
        GradesList grade3 = new GradesList(4.5, 4.5, 5.5, 3.0);
        GradesList grade4 = new GradesList(4.0, 4.5, 5.5, 3.0);

        Map<Student, GradesList> gradebook = new HashMap<>();
        gradebook.put(student1,grade1);
        gradebook.put(student2,grade2);
        gradebook.put(student3,grade3);
        gradebook.put(student4,grade4);

        for (Map.Entry<Student, GradesList> entry : gradebook.entrySet()) {
            Student key = entry.getKey();
            GradesList value = entry.getValue();
            System.out.println("Student: " + key);
            System.out.println("Grade: " + value);
        }
        for (Student student : gradebook.keySet()) {
            GradesList grades = gradebook.get(student);
            double average = (grades.grade1 + grades.grade2 + grades.grade3 + grades.grade4) / 4;
            System.out.println(student + "- średnia ocen: " + average);
        }
    }
}
