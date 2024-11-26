package org.isPresentDemo;

public class Teacher {
    private final String name;
    private TeacherAssistant assistant;

    public Teacher(String name) {
        this.name = name;
    }

    public void findAssistant(TeacherAssistant assistant) {
        this.assistant = assistant;
        System.out.printf("%s is finding the assistant.%n", name);
    }

    public void askQuestion() {
        while (assistant.hasNext()) {
            System.out.printf("%s is asking a question.%n", name);
            Student student = assistant.next();
            student.answerQuestion();
        }
    }
}
