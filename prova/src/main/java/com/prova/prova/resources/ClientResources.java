package com.prova.prova.resources;

import com.prova.prova.entities.Client;
import com.prova.prova.services.ClientServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class ClientResources {
    private final ClientServices clientServices;

    public ClientResources(ClientServices clientServices) {
        this.clientServices = clientServices;
    }

    @GetMapping
    public ResponseEntity<List<Client>> clientsList(){
        return ResponseEntity.ok(clientServices.clientList());
    }

    @PostMapping
    public ResponseEntity<Client> newClient(@RequestBody @Valid Client client){
        return new ResponseEntity<>(clientServices.newClient(client), HttpStatus.CREATED);
    }
}
