package com.bechir.relation.services;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import com.bechir.relation.daos.FichierRepository;
import com.bechir.relation.dto.FichierDto;
import com.bechir.relation.models.Fichier;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FichierService {
    @Autowired
    private FichierRepository fichierRepository;

    public Fichier addFichier(String title, MultipartFile file) throws IOException {
        Fichier photo = new Fichier(null, title, null,LocalDateTime.now());
        photo.setMonFichier(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = fichierRepository.insert(photo);
        return photo;
    }

    public void deleteFichier(String id) {
        fichierRepository.deleteById(id);
    }

    public FichierDto getFichier(String id) {
        Fichier f = fichierRepository.findById(id).get();
        FichierDto rest = new FichierDto(f.getTitle(), Base64.getEncoder().encodeToString(f.getMonFichier().getData()));
        return rest;
    }

    public List<FichierDto> findAllDto() {
        return fichierRepository.findAll().stream().map(this::fichierToDto).collect(Collectors.toList());
    }

    public List<Fichier> findAll() {
        return fichierRepository.findAll();
    }

    private FichierDto fichierToDto(Fichier f) {
        return new FichierDto(f.getTitle(), Base64.getEncoder().encodeToString(f.getMonFichier().getData()));
    }

}