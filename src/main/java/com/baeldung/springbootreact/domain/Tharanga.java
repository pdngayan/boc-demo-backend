package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tharanga")
public class Tharanga {

    @Id
    @GeneratedValue
    private Long idt;

    private String namet;
    private String emailt;

    public Tharanga() {
    }

    public Tharanga(String name, String email) {
        this.namet = name;
        this.emailt = email;
    }

    public Tharanga(Long id, String name, String email) {
        this.idt = id;
        this.namet = name;
        this.emailt = email;
    }

    public Long getIdt() {
        return idt;
    }

    public void setIdt(Long idt) {
        this.idt = idt;
    }

    public String getNamet() {
        return namet;
    }

    public void setNamet(String namet) {
        this.namet = namet;
    }

    public String getEmailt() {
        return emailt;
    }

    public void setEmailt(String emailt) {
        this.emailt = emailt;
    }
}
