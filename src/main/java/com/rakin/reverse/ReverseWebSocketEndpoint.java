package com.rakin.reverse;

import java.io.IOException;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/reverse")
public class ReverseWebSocketEndpoint {
	
	public void handleMessage(Session session, String message) throws IOException {
		session.getBasicRemote()
				.sendText("Reversed: " + new StringBuilder(message).reverse());
		 System.out.println(message);
}
	@OnOpen
	public void onOpenMsg(){
		System.out.println("mesg");
	}

}
