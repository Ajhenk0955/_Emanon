package application;

import java.io.IOException;

public class MainRunner {

	public static void main(String[] args) {
		SocketManager start = new SocketManager();
		Requestor processor = new Requestor();
		while (true) {
			try {
				//TODO potentially change all the communication to session related messaging
				String input = start.input.readLine();
				start.output.flush();
				String output = null;
				// reads input for communication attempts
				// decrypt TODO
				// once decrypted sends to requestor to process
				processor.changeLine(input);
				output = processor.identify();
				// encrypt TODO
				// write response back
				start.output.writeUTF(output);
				// after x amount of time session will request extension or
				// terminate
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
		}

	}

}
