package org.multiIteratorDemo;

public class StrictTeacherAssistant extends TeacherAssistant {

    @Override
    public void createAStudentNameList(Student[] students) {
        this.students = students;
        System.out.println("The strict teacher assistant is creating a student name list.");
    }

    @Override
    public boolean hasNext() { return currentIndex < students.length; }

    public StrictTeacherAssistant() {
        super();
    }

}
