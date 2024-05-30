package com.cts.userRegestration.Services;

import com.cts.userRegestration.Model.User;
import com.cts.userRegestration.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private KafkaProducer kafkaProducer;

    public User registerUser(User user) {
        //User savedUser = userRepository.save(user);
        kafkaProducer.sendUserCredentialsToKafka(user.getUsername(), user.getPassword());
        return user;
    }
}