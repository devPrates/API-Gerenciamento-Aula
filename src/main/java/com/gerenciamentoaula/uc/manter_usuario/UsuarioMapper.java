package com.gerenciamentoaula.uc.manter_usuario;

import com.gerenciamentoaula.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    public UsuarioMapper INSTANCE = Mappers
            .getMapper(UsuarioMapper.class);

    public UsuarioResponse toDto(Usuario entity);

    public List<UsuarioResponse> toDtoList(List<Usuario> items);

    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "password", ignore = true)
    Usuario toEntity(UsuarioResponse dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    Usuario toEntity(UsuarioRequest dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    Usuario toEntity(UsuarioRegisterRequest dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "authorities", ignore = true)
    Usuario update(UsuarioRequest dto,
                   @MappingTarget Usuario entity);
}
