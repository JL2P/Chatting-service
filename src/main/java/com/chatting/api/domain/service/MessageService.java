package com.chatting.api.domain.service;

import com.chatting.api.domain.Message;
import com.chatting.api.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public Message addMessage(Message message){
       return messageRepository.save(message);
    }

}
