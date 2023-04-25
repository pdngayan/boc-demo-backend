package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prageeth")
public class Prageeth {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    private int mobile;

    public Prageeth() {
    }

    public Prageeth(String name, String email, int mobile) {
        this.name = name;
        this.email = email;
        this.setMobile(mobile);
    }

    public Prageeth(Long id, String name, String email, int mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.setMobile(mobile);
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

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
