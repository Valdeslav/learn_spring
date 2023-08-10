package alyona.maskalenka.orm_example.service;

import alyona.maskalenka.orm_example.entity.Group;
import alyona.maskalenka.orm_example.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService extends BasicServiceImpl<Group> {

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        super(groupRepository);
    }
}
