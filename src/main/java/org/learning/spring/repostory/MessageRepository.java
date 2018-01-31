package org.learning.spring.repostory;


import org.learning.spring.model.Message;

import java.util.List;

public interface MessageRepository {
    List<Message> findAll();
}
