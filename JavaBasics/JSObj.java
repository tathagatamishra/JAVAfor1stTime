class Student {
    int roll;
    String name;
    int marks;
}

public class JSObj {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.roll = 1;
        stu1.name = "Bob";
        stu1.marks = 67;

        Student stu2 = new Student();
        stu2.roll = 2;
        stu2.name = "Rex";
        stu2.marks = 73;

        Student stu3 = new Student();
        stu3.roll = 3;
        stu3.name = "Nina";
        stu3.marks = 85;

        Student[] studentArr = new Student[3];
        studentArr[0] = stu1;
        studentArr[1] = stu2;
        studentArr[2] = stu3;

        for (Student student : studentArr) {
            System.out.println(student.name + ": " + student.marks);
        }
    }
}