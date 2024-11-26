package org.isPresentDemo;

public class TeacherAssistant {
    private Student[] students;
    private int currentIndex = 0;

    public void createAStudentNameList(Student[] students) {
        this.students = students;
        System.out.println("The teacher assistant is creating a student name list.");
    }

    public boolean hasNext() {
        while (currentIndex < students.length) {
            if (students[currentIndex].isPresent()) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    public Student next() {
        return students[currentIndex++];
    }

    public void reset() {
        currentIndex = 0;
    }
}
