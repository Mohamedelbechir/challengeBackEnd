package com.bechir.relation.daos;

import com.bechir.relation.models.Prestataire;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface PrestataireRepository extends MongoRepository<Prestataire, String> {

}