package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thilina")
public class Thilina
{
    @Id
    @GeneratedValue
    private long id;


    private String name;


    public Thilina(String name) {
        this.name = name;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }








}
