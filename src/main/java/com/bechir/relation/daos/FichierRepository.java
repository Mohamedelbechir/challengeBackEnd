package com.bechir.relation.daos;

import com.bechir.relation.models.Fichier;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource
public interface FichierRepository extends MongoRepository<Fichier, String> {

}