package demo;

import java.io.Serializable;

public class Student implements Serializable {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() { return age; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
