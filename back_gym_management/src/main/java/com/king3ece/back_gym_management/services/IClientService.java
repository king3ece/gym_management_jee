package com.king3ece.back_gym_management.services;

import com.king3ece.back_gym_management.models.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    Client addClient(Client client);

    List<Client> getClients();

    Optional<Client> getClient(Long id);

    Client updateClient(Long id, Client client);

    String deleteClient(Long id);
}
