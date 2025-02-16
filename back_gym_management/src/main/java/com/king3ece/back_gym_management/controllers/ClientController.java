package com.king3ece.back_gym_management.controllers;

import com.king3ece.back_gym_management.models.Client;
import com.king3ece.back_gym_management.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController{

    private ClientService clientService;

    @PostMapping("/create")
    public Client create(@RequestBody Client client){
        return clientService.addClient(client);
    };

    @GetMapping("/all")
    public List<Client> getClients(){
        return clientService.getClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @PutMapping("/update/{id}") //?name=king3ece login/AZE
    public Client updateClient(@PathVariable Long id, @RequestBody Client client){
        return clientService.updateClient(id, client);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id){
        return clientService.deleteClient(id);
    }
}
