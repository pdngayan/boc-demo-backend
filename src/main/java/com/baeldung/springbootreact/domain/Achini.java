package com.baeldung.springbootreact.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="achini")
public class Achini {


    @Id
    @GeneratedValue
    private Long Id;



    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Achini(String name) {
        this.name = name;
    }
    public Achini(){

    }
}
