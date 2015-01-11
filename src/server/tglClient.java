package server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax. swing.JOPtionPane;

public class tglClient {

	public static void main(String[] args) throws IOException {
		String serverAddress =JOPtionPane.showInputDialog ("Masukan Alamat IP atau Hostname\n" + "port server 85:");
		Socket s = new Socket(serverAddress, 85);
		BufferedReader input =
				new BufferedReader (new InputStreamReader(s.getInputStream()));
		String answer = input.readLine();
		JOPtionPane

	}

}
