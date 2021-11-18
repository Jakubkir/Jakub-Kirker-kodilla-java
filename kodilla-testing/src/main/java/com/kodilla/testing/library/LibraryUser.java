package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String fristname;
    private String lastname;
    private String peselId;

    public LibraryUser(String fristname, String lastname, String peselId) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public LibraryUser() {
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(fristname, that.fristname) && Objects.equals(lastname, that.lastname) && Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fristname, lastname, peselId);
    }
}
