package com.chatting.api.web;

import com.chatting.api.domain.Message;
import com.chatting.api.domain.service.MessageService;
import com.chatting.api.web.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class ChatController {

    private final MessageService messageService;

    @MessageMapping("/message")
    @SendTo("/topic/roomId")
    public MessageDto boradCast(Message message){

        if (Message.MessageType.ENTER.equals(message.getType())) {
            message.setContent(message.getUsername() + "님이 입장하셨습니다.");
            return new MessageDto(message);
        }

        return new MessageDto(messageService.addMessage(message));
    }
}

