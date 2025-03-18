package com.kevin.spring.security.utility;

import com.kevin.spring.security.dto.UserDataRequest;
import com.kevin.spring.security.model.UserData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserDataMapper {
    UserDataMapper INSTANCE = Mappers.getMapper(UserDataMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    UserData toEntity(UserDataRequest userDataRequest);
}
