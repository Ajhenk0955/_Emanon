package application;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	ServerSocket MyService;
	Socket serviceSocket = null;
	BufferedReader input;
	DataOutputStream output;
	int portNumber = 3535;

	Main() {
		openSocket();
		socketObject();
		createInputStream();
		createOutputStream();
	}

	public boolean openSocket() {

		try {
			MyService = new ServerSocket(portNumber);
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;

	}

	public boolean socketObject() {

		try {
			serviceSocket = MyService.accept();
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public boolean createInputStream() {

		try {
			input = new BufferedReader(new InputStreamReader(
					serviceSocket.getInputStream()));
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	
	public boolean createOutputStream() {

		try {
			output = new DataOutputStream(serviceSocket.getOutputStream());
		} catch (IOException e) {
			System.out.println(e);
		}
		return false;

	}

	public boolean closeDataStreams() {
		try {
			output.close();
			input.close();
			serviceSocket.close();
			MyService.close();
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Main start = new Main();
		while (true) {
			try {
				String line = start.input.readLine();
				//reads input for login attempts
				//then should create a session
				//then with a session code should answer any requests
				//after x amount of time session will request extension or terminate
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
