package com.sahil.lovable_clone.entity;

import com.sahil.lovable_clone.enums.MessageRole;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long chatMessage;
    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls; /// JSON Array of tools called

    Integer tokensUsed;
    Instant createdAt;


}
