# WebSocket Chat Application

This is a WebSocket-based real-time chat application built using **Spring Boot**, **SockJS**, and **STOMP**. It allows multiple users to join and send messages in real-time.

## Features
- **Real-time messaging** using WebSockets.
- **SockJS fallback** for environments that do not support WebSockets.
- **STOMP protocol** for message communication between client and server.
- Easy integration with a frontend that connects via WebSocket.

## Technologies Used
- **Backend**: Spring Boot, Spring WebSocket, Spring STOMP
- **Frontend**: HTML, JavaScript, SockJS, STOMP.js
- **Deployment**: Railway (for both frontend and backend)

## Access URL

You can access the WebSocket chat application through the following URL:

**WebSocket URL**:  
[https://websocket-chat-app-production-dfe7.up.railway.app/chat](https://websocket-chat-app-production-dfe7.up.railway.app/chat)

## How It Works

1. **Backend (Spring Boot)**: 
   - The backend is responsible for handling WebSocket connections, using STOMP over WebSockets to enable real-time messaging.
   - It has a **/chat** endpoint for WebSocket connections, which is exposed via **SockJS** for fallback support.
   - The backend is configured to allow connections only from the specified frontend URL (CORS policy).

2. **Frontend**:
   - The frontend uses **SockJS** and **STOMP.js** to connect to the backend WebSocket server.
   - It listens to the `/topic/messages` topic for incoming messages and displays them in real-time.
   
3. **Message Flow**:
   - When a user sends a message, it is published to the backend, which broadcasts it to all connected clients.

## Running Locally

To run the application locally, follow these steps:

### Prerequisites:
- JDK 17 or higher
- Maven or Gradle (for building the project)
- A web browser for testing the frontend

### Backend:
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/websocket-chat-app.git
   cd websocket-chat-app
   ```
   
2. Build the backend:
   ```bash
   mvn clean install
   ```

3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

### Frontend:
- Open the frontend code (HTML, JavaScript) in a browser, or serve it using a simple web server like **Live Server** in VS Code.

## Contributing

Feel free to fork this repository and submit pull requests. If you encounter any issues or have suggestions for improvements, open an issue in the GitHub repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
