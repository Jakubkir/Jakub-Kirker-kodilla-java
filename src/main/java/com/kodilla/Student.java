package com.kodilla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String lastname;
    private Map<String, List<Double>> marks = new HashMap<>();

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void addMark(String name, Double mark) {
        List<Double> studentMarks = marks.getOrDefault(name, new ArrayList<>());
        studentMarks.add(mark);
        marks.put(name, studentMarks);

    }
}
