package org.learning.spring.web;

import org.learning.spring.model.Message;
import org.learning.spring.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    private MessageService service;
    @Autowired
    public MessageController(MessageService service) {
        this.service = service;
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Message>  messages() {
        return service.findMessages();
    }
}
