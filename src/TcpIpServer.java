import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//server 실행 시키고 client 실행한다
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
			    System.out.println(" 연결요청을 기다립니다.");
			    //console실행하고 나서 종료할 땐 빨간사각형버튼 눌러준다.
			    Socket socket = serverSocket.accept();
			    System.out.println(socket.getInetAddress()+ " 로 부터 연결 요청이 들어옴");
			    
			    OutputStream out = socket.getOutputStream();
			    DataOutputStream dos = new DataOutputStream(out);
			    
			    dos.writeUTF("[Notice] 접속 성공 Message from Server");
			    System.out.println("데이터를 전송했습니다.");
			    dos.close();
			    
			    //stream : socket 과 socket간의 연결해주는거 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}		
	}
}
