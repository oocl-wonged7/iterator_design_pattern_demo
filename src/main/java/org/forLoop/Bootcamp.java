package org.forLoop;

import java.util.List;

public class Bootcamp {
    private final List<Student> studentsList;

    public Bootcamp(List<Student> students) {
        this.studentsList = students;
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice"),
                new Student("Bob"),
                new Student("Charlie"),
                new Student("Diana")
        );

        Bootcamp bootcamp = new Bootcamp(students);

        // when mingHao come into the class, he needs to create a new student list himself.
        Teacher mingHao = new Teacher("MingHao");
        mingHao.CreateAStudentNameList(bootcamp.studentsList);
        System.out.printf("%s is asking a question.%n", mingHao.name);
        mingHao.studentsNameList.stream()
                .forEach(student -> {
                    student.answerQuestion();
                });;

        System.out.println("\n\nDing Dong~~ Ding Dong~~");
        System.out.println("MingHao's lesson is over.\n\n");

        // when shangQi come into the class, he needs to create a new student list himself.
        // He can't use the list created by MingHao.
//        Teacher shangQi = new Teacher("ShangQi");
//        shangQi.CreateAStudentNameList(bootcamp.studentsList);
//        System.out.printf("%s is asking a question.%n", shangQi.name);
//        shangQi.studentsNameList.stream()
//                .forEach(student -> {
//                    student.answerQuestion();
//                });
//

    }
}
