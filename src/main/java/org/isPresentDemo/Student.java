package org.isPresentDemo;

// Student class
public class Student {
    private final String name;

    private Boolean present = true;

    public Student(String name, Boolean present) {
        this.name = name;
        this.present = present;
    }

    public Boolean isPresent() {
        return present;
    }

    public String getName() {
        return name;
    }

    public void answerQuestion() {
        System.out.println(name + " is answering the question.");
    }
}