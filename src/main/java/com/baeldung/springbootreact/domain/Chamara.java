package com.baeldung.springbootreact.domain;

import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chamara")
public class Chamara {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Chamara() {
        System.out.println("chamara");
    }

    public Chamara(String name, String email) {
        this.name = name;
        this.email = email;
        //System.out.println(">>>>>")
    }

    public Chamara(Long id, String name, String email) {
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
//comment by thiliA
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    //SC
    //Hello from Lakshika
    public void setEmail(String email) {
        this.email = email;
    }

    // TS

        //pr
    public void inetBanking(){
        System.out.println("Success");
    }

    public void inetBankingNot(){
        System.out.println("Fail");
        System.out.println("Okay");
    }
}
