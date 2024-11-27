package org.isPresentDemo;

public class Teacher {
    public final String name;
    public TeacherAssistant assistant;

    public Teacher(String name) {
        this.name = name;
    }

    public void findAssistant(TeacherAssistant assistant) {
        this.assistant = assistant;
    }

    public void askQuestion() {
        System.out.printf("%s is asking a question.%n", name);
        while (assistant.hasNext()) {
            Student student = assistant.next();
            student.answerQuestion();
        }
    }
}
