package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "eranga")
public class Eranga {
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
