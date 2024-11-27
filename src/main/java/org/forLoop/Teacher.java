package org.forLoop;

import java.util.List;

public class Teacher {
    public final String name;
    public List<Student> studentsNameList;

    public Teacher(String name) {
        this.name = name;
    }

    public void CreateAStudentNameList(List<Student> students) {
        this.studentsNameList = students;
        // System.out.printf("%s is creating a student name list.%n", name);
    }

    public void askQuestion() {
        for (Student student : studentsNameList) {
            System.out.printf("%s is asking a question.%n", name);
            student.answerQuestion();
        }
    }
}
