package com.king3ece.back_gym_management.services;

import com.king3ece.back_gym_management.models.Client;
import com.king3ece.back_gym_management.repositories.ClientRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter @Setter
@Service
@AllArgsConstructor
public class ClientService implements IClientService{

    private  ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClient(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client updateClient(Long id, Client client) {
        return clientRepository.findById(id)
                .map( existingClient -> {
                    existingClient.setFirstName(client.getFirstName());
                    existingClient.setLastName(client.getLastName());
                    existingClient.setPhoneNumber(client.getPhoneNumber());
                    return clientRepository.save(existingClient);
                }).orElseThrow(()-> new RuntimeException("Client not find! "));

    }

    @Override
    public String deleteClient(Long id) {
        clientRepository.deleteById(id);
        return "Client deleted";
    }
}
