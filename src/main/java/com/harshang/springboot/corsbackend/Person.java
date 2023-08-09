package com.harshang.springboot.corsbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;

    protected Person() {
        this.name="";
        this.email="";
    }

    public Person(String name) {
        super();
        this.name = name;
        this.email = name + "@domain.com";
    }

    public Person(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
            "Person[id=%d, name='%s', email='%s']",
            id, name, email);
    }    

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

}
