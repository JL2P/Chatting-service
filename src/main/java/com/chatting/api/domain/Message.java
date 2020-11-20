package com.chatting.api.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages")
public class Message {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long roomId;
    public enum MessageType {
        ENTER, TALK //ENTER:입장, TALK: 채팅
    }
    private MessageType type; // 메시지 타입
    private String username;
    private String content;
    private Date date;

}
