package networking;

import java.io.*;
import java.net.*;

public class NetworkingClient {
	static int id;
	static String firstName;
	static String lastName;
	static String email;
	
	
    public NetworkingClient(int id, String firstName, String lastName, String email) {
    	
    	this.id=id;
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.email=email;
    	
    }
    public NetworkingClient(int id) {
    	this.id=id;
    }
    public NetworkingClient() {
    	super();
    }
    public static void main(String args[]) {
        
        Socket client = null;
        
        // Default port number we are going to use
        int portnumber = 1234;
        
        
        //for (int i=0; i <10; i++) {
            try {
                //String msg[] ={Integer.toString(id),firstName,lastName,email};
                String msg=Integer.toString(id);
                // Create a client socket
                
                client = new Socket(InetAddress.getLocalHost(), portnumber);
                System.out.println("Client socket is created " + client);
                
                // Create an output stream of the client socket
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                
                // Create an input stream of the client socket
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
                
                // Create BufferedReader for a standard input
                BufferedReader stdIn = new BufferedReader(new
                        InputStreamReader(System.in));
                
                //System.out.println("Enter your name. Type Bye to exit. ");
                
                // Read data from standard input device and write it
                // to the output stream of the client socket.
                //msg = {Integer.parseInt(id),firstName,lastName,email};
                // stdIn.readLine().trim();
                pw.println(msg);
                
                // Read data from the input stream of the client socket.
               // System.out.println("Message returned from the server = " + br.readLine());
                
                pw.close();
                br.close();
                client.close();
                
                // Stop the operation
                //if (msg.equalsIgnoreCase("Bye")) {
                   // break;
                //}
                
            } catch (IOException ie) {
                System.out.println("I/O error - Start server and turn off Firewall" + ie);
            }
        }
    }

	


