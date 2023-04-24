package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lasitha")

public class Lasitha {

        @Id
        @GeneratedValue
        private Long id;

        private String name;
       // private String email;

   // public Client() {
  //  }

   /* public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }*/

    public Lasitha(Long id, String name) {
        this.id = id;
        this.name = name;
       // this.email = email;
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

    /*    public String getEmail() {
        return email;
    }

        public void setEmail(String email) {
        this.email = email;
    }*/

}
