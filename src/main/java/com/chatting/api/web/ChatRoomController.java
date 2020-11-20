package com.chatting.api.web;

import com.chatting.api.domain.ChatRoom;
import com.chatting.api.domain.service.ChatRoomService;
import com.chatting.api.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/chat")
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    // 모든 채팅방 목록 반환
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> room() {
        return chatRoomService.findAllRoom();
    }

    // 채팅방 생성
    @PostMapping("/createroom")
    @ResponseBody
    public ChatRoom createRoom(@RequestParam Long id, @RequestParam String name) {
        return chatRoomService.createChatRoom(id, name);
    }

    // 특정 채팅방 조회
    @GetMapping("/room/{roomId}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String roomId) {
        return chatRoomService.findRoomById(roomId);
    }
}