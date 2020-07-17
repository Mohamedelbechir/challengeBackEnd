package com.bechir.relation.controllers;

import java.util.List;

import com.bechir.relation.models.Client;
import com.bechir.relation.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@CrossOrigin(origins = "/*")
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody final Client Client) throws Exception {
        try {
            Client added = clientService.save(Client);
            return new ResponseEntity<>(added, HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }

    
}