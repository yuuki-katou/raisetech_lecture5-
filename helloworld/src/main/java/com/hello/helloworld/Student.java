package com.hello.helloworld;

public class Student {
    private String name;
    private String email;

    private String className;

    public Student(String name, String email, String className) {
        this.name = name;
        this.email = email;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getClassName() {
        return className;
    }
}
