package chat;

//TcpIpChatServer

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpChatServer {
//p.814
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("������ �����");
		    socket = serverSocket.accept();
		    
		    Sender sender = new Sender(socket);
		    sender.start();
		   
		    
		    Receiver receiver = new Receiver(socket);
		    receiver.start();
		    
		    
		    
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
