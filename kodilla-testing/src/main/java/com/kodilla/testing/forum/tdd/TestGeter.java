package com.kodilla.testing.forum.tdd;

import java.util.Objects;

public class TestGeter {
    String name;
    String subname;

    public TestGeter(String name, String subname) {
        this.name = name;
        this.subname = subname;
    }

    public TestGeter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TestGeter() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestGeter testGeter = (TestGeter) o;
        return Objects.equals(name, testGeter.name) && Objects.equals(subname, testGeter.subname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subname);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestGeter{" +
                "name='" + name + '\'' +
                ", subname='" + subname + '\'' +
                '}';
    }
}
