package com.baeldung.springbootreact.domain;

public class Vendor {



    private Long id;

    private String name;


    public Vendor(Long id, String name, String email) {
        this.id = id;
        this.name = name;

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

}

