package org.iteratorDemo;

public class Bootcamp {
    private final Student[] studentsList;

    public Bootcamp(Student[] students) {
        this.studentsList = students;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice"),
                new Student("Bob"),
                new Student("Charlie"),
                new Student("Diana")
        };

        Bootcamp bootcamp = new Bootcamp(students);
        TeacherAssistant assistant = new TeacherAssistant();
        assistant.createAStudentNameList(bootcamp.studentsList);

        Teacher mingHao = new Teacher("MingHao");
        mingHao.findAssistant(assistant);
        mingHao.askQuestion();

        System.out.println("\n\nDing Dong~~ Ding Dong~~");
        System.out.println("MingHao's lesson is over. ShangQi is coming in.\n\n");

        Teacher shangQi = new Teacher("ShangQi");
        shangQi.findAssistant(assistant);
        assistant.reset();
        shangQi.askQuestion();
    }
}
