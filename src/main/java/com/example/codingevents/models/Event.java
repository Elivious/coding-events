package com.example.codingevents.models;
import javax.validation.constraints.*;
import java.util.Objects;

public class Event {
    private int id;

    private static int nextId = 1;

    @NotBlank
    @Size(min = 3, max=50)
    private String name;
    @Size(max=500)
    private String description;
    @Email
    private String  contactEmail;

    public Event(String name, String description, String contactEmail) {
        this.description = description;
        this.contactEmail=contactEmail;
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

