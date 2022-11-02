package com.server.blogsapi.mapper;

import com.server.blogsapi.dto.BlogDTO;
import com.server.blogsapi.entity.BlogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface BlogMapper {

    BlogMapper INSTANCE = Mappers.getMapper(BlogMapper.class);
    @Mapping(target = "blogBody", source = "body")
    BlogEntity dtoToEntity(BlogDTO dto);

    BlogDTO entityToDto(BlogEntity entity);
}
