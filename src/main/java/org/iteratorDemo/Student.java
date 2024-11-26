package org.iteratorDemo;

// Student class
public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void answerQuestion() {
        System.out.println(name + " is answering the question.");
    }
}