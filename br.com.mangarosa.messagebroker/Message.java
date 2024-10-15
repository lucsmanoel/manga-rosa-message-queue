package br.com.mangarosa.messagebroker;

import java.time.Duration;
import java.time.LocalDateTime;

public class Message {
    private String content;           // Conteúdo da mensagem
    private LocalDateTime timestamp;  // Data e hora de criação da mensagem
    private Duration timeToLive;      // Tempo de expiração

    public Message(String content, Duration timeToLive) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.timeToLive = timeToLive;
    }

    public boolean isExpired() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(timestamp.plus(timeToLive));
    }

    public String getContent() {
        return content;
    }
}
