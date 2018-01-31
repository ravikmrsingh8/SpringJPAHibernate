package org.learning.spring.services;


import org.learning.spring.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> findMessages();
}
