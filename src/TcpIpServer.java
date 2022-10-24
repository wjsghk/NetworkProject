import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//server ���� ��Ű�� client �����Ѵ�
public class TcpIpServer {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		while(true) {
			try {
			    System.out.println(" �����û�� ��ٸ��ϴ�.");
			    //console�����ϰ� ���� ������ �� �����簢����ư �����ش�.
			    Socket socket = serverSocket.accept();
			    System.out.println(socket.getInetAddress()+ " �� ���� ���� ��û�� ����");
			    
			    OutputStream out = socket.getOutputStream();
			    DataOutputStream dos = new DataOutputStream(out);
			    
			    dos.writeUTF("[Notice] ���� ���� Message from Server");
			    System.out.println("�����͸� �����߽��ϴ�.");
			    dos.close();
			    
			    //stream : socket �� socket���� �������ִ°� 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}		
	}
}
