package com.chatting.api.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chatrooms")
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public static ChatRoom create(Long id, String name) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.id = id;
        chatRoom.name = name;
        return chatRoom;
    }

}

