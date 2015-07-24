package application;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketManager {
	ServerSocket MyService;
	Socket serviceSocket = null;
	BufferedReader input;
	DataOutputStream output;
	int portNumber = 3535;

	SocketManager() {
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

}
