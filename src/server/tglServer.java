package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class tglServer {
	public static void main(String[] args)throws IOException {
		// buka server socket port 85
		ServerSocket listener = new ServerSocket (85);
		//tunggu koneksi dari client
		System.out.println("Date Server Running....");
		try {
			while (true){
				Socket socket = listener.accept();
				try{
					PrintWriter out =
							new PrintWriter(socket.getOutputStream(), true);
					//kirimkan tanggal server ke client
					out.println("Tanggal Server: "+new Date().toString());
				} finally{
					//tutup socket client handle
					socket.close();
				}
				
			}
			
		}
		finally{
			//tutup server
			listener.close();
		}
	}

}
