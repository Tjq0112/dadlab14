package exercise6;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import exercise3.TextGenerator;

import java.io.IOException;


//import exercise6.TranslationGenerator;

public class ServerTranslationApplication {


	// Launch the server frame
			//ServerTranslationFrame serverFrame = new ServerTranslationFrame();
			//serverFrame.setVisible(true);
			
			// Binding to a port or any other port no you are fancy of
			int portNo = 4227;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			TextGenerator textGenerator = new TextGenerator();
			
			// Counter to keep track the number of requested connection
			//int totalRequest = 0;
			
			// Server needs to be alive forever
			while (true) {
				
				// Message to indicate server is alive
				//erverFrame.updateServerStatus(false);
				
				
				// Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				// Display translation
				String translation = textGenerator.translator();
				
				// Create stream to write data on the network
				DataOutputStream outputStream = 
						new DataOutputStream(clientSocket.getOutputStream());
				
				// Send current date back to the client
				outputStream.writeBytes(translation);
				
				// Close the socket
				clientSocket.close();
			
				// Update the request status
				//serverFrame.updateRequestStatus(
						//"Data sent to the client: " + translation);
				/*serverFrame.updateRequestStatus("Accepted connection to from the "
						+ "client. Total request = " + ++totalRequest );*/
				
			}
			
			

		}
}
