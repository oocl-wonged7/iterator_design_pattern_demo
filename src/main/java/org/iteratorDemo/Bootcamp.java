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

        Teacher mingHao = new Teacher("MingHao");
        System.out.printf("%s is finding the assistant.%n", mingHao.name);
        TeacherAssistant assistant = new TeacherAssistant();
        assistant.createAStudentNameList(bootcamp.studentsList);
        mingHao.findAssistant(assistant);
        mingHao.askQuestion();

        System.out.println("\nDing Dong~~ Ding Dong~~");
        System.out.println("MingHao's lesson is over. ShangQi is coming in.\n");

        Teacher shangQi = new Teacher("ShangQi");
        System.out.printf("%s is finding the assistant.%n", shangQi.name);
        shangQi.findAssistant(assistant);
        assistant.reset();
        shangQi.askQuestion();
    }
}
