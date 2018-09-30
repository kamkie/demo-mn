package demo.mn;

import io.micronaut.websocket.WebSocketBroadcaster;
import io.micronaut.websocket.WebSocketSession;
import io.micronaut.websocket.annotation.*;

@ServerWebSocket("/ws/{topic}")
public class WsServer {
    private WebSocketBroadcaster broadcaster;

    public WsServer(WebSocketBroadcaster broadcaster) {
        this.broadcaster = broadcaster;
    }

    @OnOpen
    public void onOpen() {}

    @OnMessage
    public void onMessage() {}

    @OnClose
    public void onClose() {}

}