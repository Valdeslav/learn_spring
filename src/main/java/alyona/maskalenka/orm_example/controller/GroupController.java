package alyona.maskalenka.orm_example.controller;

import alyona.maskalenka.orm_example.dto.StudGroupDTO;
import alyona.maskalenka.orm_example.dto.StudentDTO;
import alyona.maskalenka.orm_example.entity.StudGroup;
import alyona.maskalenka.orm_example.service.GroupService;
import alyona.maskalenka.orm_example.service.StudentService;
import alyona.maskalenka.orm_example.service.mapper.GroupMapper;
import alyona.maskalenka.orm_example.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;
    @Autowired
    public GroupMapper groupMapper;

    @GetMapping
    public List<StudGroupDTO> getAll() {
        return groupService.findAll().stream()
                .map(groupMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public StudGroupDTO create(@RequestBody StudGroupDTO studGroupDTO) {
        StudGroup studGroup = groupMapper.toEntity(studGroupDTO);
        return groupMapper.toDto(groupService.save(studGroup));
    }
}
