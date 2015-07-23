package application;

import java.util.HashMap;

// reads server input and executes command

/*
 * the current iteration of the requestor runs this way.
 * The first 5 characters are a command
 * we run it through a switch and run the proper methods
 * the methods return a string with the output
 * which is then forwarded to the main class to export to the client
 */
public class Requestor {
	String line;

	public boolean changeLine(String line) {
		if (line == null)
			return false;
		this.line = line;
		return true;
	}

	// removes the idTag from the line. uses a switch to execute commands
	public String identify() {
		if (line == null)
			return "fail";
		String idTag = line.substring(0, 5);

		// runs tag through a switch
		switch (idTag) {
		// start a session
		case "00000":
			return startSession();
			// end a session
		case "00001":
			return endSession();
			// add a file
		case "00010":
			return addFile();
			// remove a file
		case "00011":
			return removeFile();
			// add a patient
		case "00100":
			return addPatient();
			// remove a patient
		case "00101":
			return removePatient();
			// search
		case "00111":
			return search();
		default:
			return "fail";
		}

	}

	private String search() {
		return null;
		// TODO Auto-generated method stub

	}

	private String removePatient() {
		return null;
		// TODO Auto-generated method stub

	}

	private String addPatient() {
		return null;
		// TODO Auto-generated method stub

	}

	private String removeFile() {
		return null;
		// TODO Auto-generated method stub

	}

	private String addFile() {
		return null;
		// TODO Auto-generated method stub

	}

	private String endSession() {
		return null;
		// TODO Auto-generated method stub

	}

	private String startSession() {
		return null;
		// TODO Auto-generated method stub

	}

}
