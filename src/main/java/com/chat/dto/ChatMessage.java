package com.chat.dto;

import com.chat.enums.MessageType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType messageType;
}
