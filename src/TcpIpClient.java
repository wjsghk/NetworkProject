//TcpIpClient

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {
	    System.out.println("������ ���� �մϴ�.");
        try {
			Socket socket = new Socket("192.168.0.241",7777);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("������ ���� ���� �޼���" + dis.readUTF());
			System.out.println("��������");
			
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
