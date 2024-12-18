package org.isPresentDemo;

public class Bootcamp {
    private final Student[] studentsList;

    public Bootcamp(Student[] students) {
        this.studentsList = students;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", true),
                new Student("Bob", false),
                new Student("Charlie", false),
                new Student("Diana", true)
        };

        Bootcamp bootcamp = new Bootcamp(students);

        Teacher mingHao = new Teacher("MingHao");
        System.out.printf("%s is finding the assistant.%n", mingHao.name);

        TeacherAssistant assistant = new TeacherAssistant();
        assistant.createAStudentNameList(bootcamp.studentsList);

        mingHao.findAssistant(assistant);
        mingHao.askQuestion();

        System.out.println("\n\nDing Dong~~ Ding Dong~~");
        System.out.println("MingHao's lesson is over. ShangQi is coming in.\n\n");

//        Teacher shangQi = new Teacher("ShangQi");
//        System.out.printf("%s is finding the assistant.%n", shangQi.name);
//        shangQi.findAssistant(assistant);
//        assistant.reset();
//
//        shangQi.askQuestion();
    }
}
