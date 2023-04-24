package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "akalanka")
public class Akalanka {

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}