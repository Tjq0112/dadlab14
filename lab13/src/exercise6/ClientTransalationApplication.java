package exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTransalationApplication{

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		// Launch client-side frame
		ClientTranslationFrame clientTranslationFrame = new ClientTranslationFrame();
		clientTranslationFrame.setVisible(true);
		
		// Connect to the server @ localhost, port 4228
		Socket socket = new Socket(InetAddress.getLocalHost(), 4227);
		
		// Update the status of the connection
		clientTranslationFrame.updateConnectionStatus(socket.isConnected());
		
		// Read from client
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		DataOutputStream outputToServer = new DataOutputStream(socket.getOutputStream());
		String text = "Good Morning";
		String language = "Bahasa Malaysia";
		outputToServer.writeBytes(text + "\n");
		outputToServer.writeBytes(language + "\n");
		
		// Display the current date
		//String currentDate = bufferedReader.readLine();
		//clientDateFrame.updateServerDate(currentDate);
		
		//Receive from server
		BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String translation = inputFromServer.readLine();
		System.out.println("Translated text = "+ translation);
		
		// Close everything
		bufferedReader.close();
		socket.close();

	}
}
