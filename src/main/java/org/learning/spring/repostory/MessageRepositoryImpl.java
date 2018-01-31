package org.learning.spring.repostory;


import org.learning.spring.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepositoryImpl implements MessageRepository{

    public List<Message> findAll() {
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message(1,"hey!"));
        messages.add(new Message(2,"hello!"));
        messages.add(new Message(3,"howdy!"));
        messages.add(new Message(4,"Hi Brother!"));
        return messages;
    }
}
