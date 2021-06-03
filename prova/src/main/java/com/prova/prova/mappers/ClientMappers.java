package com.prova.prova.mappers;

import com.prova.prova.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ClientMappers {
    public static final ClientMappers INSTANCE = Mappers.getMapper(ClientMappers.class);

    public abstract Client toClient(Client client);
}
