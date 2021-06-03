package com.prova.prova.mappers;

import com.prova.prova.entities.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class TaskMapper {
    public static final TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    public abstract Task toTask(Task task);
}
