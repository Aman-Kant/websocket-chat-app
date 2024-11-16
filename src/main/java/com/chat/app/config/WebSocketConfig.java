package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Register WebSocket endpoint with CORS configuration
        registry.addEndpoint("/chat")
            .setAllowedOrigins("https://websocket-chat-app-production-dfe7.up.railway.app/chat") // Frontend URL
            .withSockJS(); // Enables SockJS for fallback
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Enable the simple message broker to handle destinations starting with "/topic"
        registry.enableSimpleBroker("/topic");

        // Prefix for application-specific messages (e.g., for client-to-server communication)
        registry.setApplicationDestinationPrefixes("/app");
    }
}
