package com.chatting.api.web.dto;

import com.chatting.api.domain.Message;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class MessageDto {
    private Long id;
    private Long roomId;
    private String type; // 메시지 타입
    private String username; // 보낸 사람
    private String content;
    private Date date;

    public MessageDto(Message message){
        this.id=message.getId();
        this.roomId=message.getRoomId();
        this.type=message.getType().toString();
        this.username=message.getUsername();
        this.content=message.getContent();
        this.date=message.getDate();
    }
}
