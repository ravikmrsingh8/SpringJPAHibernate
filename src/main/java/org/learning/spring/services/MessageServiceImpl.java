package org.learning.spring.services;


import org.learning.spring.model.Message;
import org.learning.spring.repostory.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{
    private MessageRepository repository;

    @Autowired
    public MessageServiceImpl(MessageRepository repository) {
        this.repository = repository;
    }
    public List<Message> findMessages() {
        return this.repository.findAll();
    }
}
