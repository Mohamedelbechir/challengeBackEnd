package com.bechir.relation.controllers;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.bechir.relation.dto.FichierDto;
import com.bechir.relation.models.Fichier;
import com.bechir.relation.services.FichierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin("*")
@RestController
public class FichierController {
    @Autowired
    private FichierService fichierService;

    @PostMapping("/fichiers")
    public ResponseEntity<Fichier> addFichier(@RequestParam("title") String title,
            @RequestParam("fichier") MultipartFile fichier) throws IOException {
        try {
            var addded = fichierService.addFichier(title, fichier);
            return new ResponseEntity<>(addded, HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }

    }

    @GetMapping("/fichiers/{id}")
    public ResponseEntity<FichierDto> getFichier(@PathVariable String id) {
        try {
            FichierDto photo = fichierService.getFichier(id);
            return new ResponseEntity<>(photo, HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/fichiers")
    public ResponseEntity<List<Fichier>> findAll() {
        try {
            var list = fichierService.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }

    @DeleteMapping("/fichiers/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable final String id) {
        try {
            fichierService.deleteFichier(id);
            Map<String, String> rest = new Hashtable<>();
            rest.put("etat", "Ok");
            return new ResponseEntity<>(rest, HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }
}