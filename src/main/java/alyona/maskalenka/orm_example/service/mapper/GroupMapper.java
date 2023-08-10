package alyona.maskalenka.orm_example.service.mapper;

import alyona.maskalenka.orm_example.dto.GroupDTO;
import alyona.maskalenka.orm_example.entity.Group;
import org.mapstruct.Mapper;

@Mapper(config = MapConfig.class, componentModel = "spring")
public interface GroupMapper extends EntityMapper<GroupDTO, Group> {
    Group toEntity(GroupDTO studentDTO);
    GroupDTO toDto(Group student);
}
