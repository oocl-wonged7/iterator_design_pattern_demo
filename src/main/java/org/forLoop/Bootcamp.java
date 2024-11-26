package org.forLoop;

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

        // when mingHao come into the class, he needs to create a new student list himself.
        Teacher mingHao = new Teacher("MingHao");
        mingHao.CreateAStudentNameList(bootcamp.studentsList);
        mingHao.askQuestion();

        System.out.println("\n\nDing Dong~~ Ding Dong~~");
        System.out.println("MingHao's lesson is over. ShangQi is coming in.\n\n");

        // when shangQi come into the class, he needs to create a new student list himself.
        // He can't use the list created by MingHao.
        Teacher shangQi = new Teacher("ShangQi");
        shangQi.CreateAStudentNameList(bootcamp.studentsList);
        shangQi.askQuestion();


    }
}
