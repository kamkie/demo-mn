package demo.mn;

import io.micronaut.websocket.WebSocketSession;
import io.micronaut.websocket.annotation.*;

@ClientWebSocket("/ws/{topic}/")
public abstract class WsClient implements AutoCloseable {

    private WebSocketSession session;

    @OnOpen
    public void onOpen(WebSocketSession session) {
        this.session = session;
    }

    @OnMessage
    public void onMessage() {}

    public WebSocketSession getSession() {
        return session;
    }
}