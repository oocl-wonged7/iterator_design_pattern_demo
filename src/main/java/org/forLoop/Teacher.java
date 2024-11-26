package org.forLoop;

public class Teacher {
    private final String name;
    private Student[] students;

    public Teacher(String name) {
        this.name = name;
    }

    public void CreateAStudentNameList(Student[] students) {
        this.students = students;
        System.out.printf("%s is creating a student name list.%n", name);
    }

    public void askQuestion() {
        for (Student student : students) {
            System.out.printf("%s is asking a question.%n", name);
            student.answerQuestion();
        }
    }
}
