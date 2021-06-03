package com.prova.prova.services;

import com.prova.prova.entities.Client;
import com.prova.prova.mappers.ClientMappers;
import com.prova.prova.repositories.ClientInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServices {
    private final ClientInterface clientInterface;

    public ClientServices(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public List<Client> clientList(){
        return clientInterface.findAll();
    }

    @Transactional
    public Client newClient(Client client){
        return clientInterface.save(ClientMappers.INSTANCE.toClient(client));
    }
}
