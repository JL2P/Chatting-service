package com.chatting.api.web.dto;

import com.chatting.api.domain.ChatRoom;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class ChatRoomDto {
    private Long id;
    private String name;

    public ChatRoomDto(ChatRoom chatRoom){
        this.id=chatRoom.getId();
        this.name=chatRoom.getName();
    }
}
