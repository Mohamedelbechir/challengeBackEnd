package com.bechir.relation.services;

import java.util.List;

import com.bechir.relation.daos.ClientRepository;
import com.bechir.relation.models.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository ClientRepository;

    public Client save(Client Client) throws Exception {
        
        Client added = ClientRepository.save(Client);
        return added;
    }

    public List<Client> findAll() {
        return ClientRepository.findAll();
    }

}