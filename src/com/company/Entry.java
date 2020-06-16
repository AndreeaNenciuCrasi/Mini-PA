package com.company;

import java.time.LocalDate;
import java.util.Date;

public abstract class Entry {
    private int id;
    private static int countId = 0;
    private String message;
    private LocalDate creationDate = LocalDate.now();

    public Entry(String message) {
        countId++;
        this.id = countId;
        this.message = message;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", message: '" + message + '\'' +
                ", creationDate: " + creationDate;
    }
}
