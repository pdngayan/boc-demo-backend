package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Osanda")
public class Osanda {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    public Osanda() {
    }

    public Osanda(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Osanda(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
