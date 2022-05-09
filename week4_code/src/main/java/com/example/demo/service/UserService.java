package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(User user) throws UserAlreadyExistException{
        if(userRepository.existsByLoginName(user.getLoginName())) {
            throw new UserAlreadyExistException("This user already exist");
        } else {
            userRepository.save(user);
        }
    }

    public User getUser(long id) throws  UserNotFoundException{
         if(!userRepository.existsById(id)) {
             throw new UserNotFoundException("This user not found");
         }
         return userRepository.findById(id);
    }
}
