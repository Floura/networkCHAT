package server;

import java.io.IOException;

public class serverSocket {

	public static void main(String[] args) throws IOException {
		int portN = 8080
				String str;
		serverSocket servSocket = new ServerSocket (cTosPortNumber);
		System.out.println("Menunggu Koneksi Client.........." + servSocket)
		Socket fromClientSocket = servSocket.accept();
		PrintWriter pw = new PrintWriter (new InputStreamReader());
		BufferedReader br = new BufferedReader

	}

}
