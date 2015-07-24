package application;

import java.util.HashMap;

// reads server input and executes command

/*
 * the current iteration of the requestor runs this way.
 * The first 5 characters are a command
 * the sixth character is used to confirm session
 * we run it through a switch and run the proper methods
 * the methods return a string with the output
 * which is then forwarded to the main class to export to the client
 */

//ERROR CODES
// 10000 = no session
// 00000 = fail
// 11111 = success
// 00011 = failed login
// 00100 = null line
// 00001 = session manager full
public class Requestor {
	String line;
	String[] sessions = new String[10];

	public boolean changeLine(String line) {
		if (line == null)
			return false;
		this.line = line;
		return true;
	}

	// removes the idTag from the line. uses a switch to execute commands
	public String identify() {
		if (line == null)
			return "00100";
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
			return "00000";
		}

	}

	private String search() {
		if (!confirmSession())
			return "10000";
		return null;
		// TODO Auto-generated method stub

	}

	private String removePatient() {
		if (!confirmSession())
			return "10000";
		return null;
		// TODO Auto-generated method stub

	}

	private String addPatient() {
		if (!confirmSession())
			return "10000";
		return null;
		// TODO Auto-generated method stub

	}

	private String removeFile() {
		if (!confirmSession())
			return "10000";
		return null;
		// TODO Auto-generated method stub

	}

	private String addFile() {
		if (!confirmSession())
			return "10000";
		return null;
		// TODO Auto-generated method stub

	}

	private String endSession() {
		if (!confirmSession())
			return "10000";
		String sessionTag = line.substring(5, 6);

		for (String check : sessions) {
			if (sessionTag == check) {
				check = null;
				return "11111";
			}
		}
		return "00000";

	}

	// session manager has 10 spaces, still needs to verify login //TODO
	private String startSession() {
		// log in
		if (!login())
			return "00011";
		for (int i = 0; i < sessions.length; i++) {
			if (sessions[i] == null) {
				sessions[i] = String.valueOf(i);
				// return sessionTag
				return sessions[i];
			}
		}
		// session manager is full
		return "00001";

	}

	private boolean confirmSession() {
		String sessionTag = line.substring(5, 6);

		for (String check : sessions) {
			if (sessionTag == check)
				return true;
		}
		return false;

	}

	private boolean login() {
		// TODO Auto-generated method stub
		return false;
	}
}
