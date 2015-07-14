package communication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientSetup {
	Socket MyClient;
	int PortNumber = 3535;
	BufferedReader input;
	PrintStream output;

	public boolean openSocket() {

		try {
			MyClient = new Socket("Server", PortNumber);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean createInputStream() {

		try {
			input = new BufferedReader(new InputStreamReader(
					MyClient.getInputStream()));
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public boolean createOutputStream() {

		try {
			output = new PrintStream(MyClient.getOutputStream());
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public boolean closeDataStreams() {
		try {
			output.close();
			input.close();
			MyClient.close();
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

	}
}
