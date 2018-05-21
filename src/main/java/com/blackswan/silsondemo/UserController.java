package com.blackswan.silsondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/user/{userId}/task")
class UserRestController
{

    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    @Autowired
    UserRestController( UserRepository userRepository,
                        TaskRepository taskRepository )
    {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    @GetMapping
    Collection<Task> getTasks(@PathVariable String userId)
    {
        User u = userRepository.findById(Long.parseLong(userId)).
                 orElseThrow(()->new RuntimeException("User not found:" + userId));

        return u.getTasks();
    }

}