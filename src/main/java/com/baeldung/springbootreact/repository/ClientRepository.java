package com.baeldung.springbootreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.baeldung.springbootreact.domain.Client;
public interface ClientRepository extends JpaRepository<Client, Long> {
}
