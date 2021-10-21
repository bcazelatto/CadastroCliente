package com.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
