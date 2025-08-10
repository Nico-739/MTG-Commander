package com.nico.mtg.mtg_commander_server.controller;

import com.nico.mtg.mtg_commander_server.dto.MessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class EchoController {

    @MessageMapping("/echo")
    @SendTo("/topic/echo")
    public MessageDTO echo(MessageDTO message) {
        return new MessageDTO("Server received: " + message.getContent());
    }
    
}
