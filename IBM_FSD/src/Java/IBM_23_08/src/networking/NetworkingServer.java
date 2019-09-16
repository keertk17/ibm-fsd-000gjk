package networking;

	import java.io.*;
	import java.io.IOException;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import javax.swing.JTable;
	import javax.swing.text.Utilities;
	import net.proteanit.sql.DbUtils;
	//import MyFrame.RS2XMLConfig;
	import java.sql.ResultSet;
	import ibm_20_08.Employee;
	import ibm_20_08_service.EmployeeService;
	import ibm_20_08_service.EmployeeServiceImpl;

	public class NetworkingServer {
		private RS2XMLConfig config=null;
		private JTable table;
	    public static void main(String [] args) throws NumberFormatException, SQLException {
	        
	        ServerSocket server = null;
	        Socket client;
	        
	        // Default port number we are going to use
	        int portnumber = 1234;
	       
	        
	        // Create Server side socket
	        try {
	            server = new ServerSocket(portnumber);
	        } catch (IOException ie) {
	            System.out.println("Cannot open socket." + ie);
	            System.exit(1);
	        }
	        System.out.println("ServerSocket is created " + server);
	        
	        // Wait for the data from the client and reply
	        while(true) {
	            
	            try {
	                
	                // Listens for a connection to be made to
	                // this socket and accepts it. The method blocks until
	                // a connection is made
	                System.out.println("Waiting for connect request...");
	                client = server.accept();
	                
	                System.out.println("Connect request is accepted...");
	                String clientHost = client.getInetAddress().getHostAddress();
	                int clientPort = client.getPort();
	                System.out.println("Client host = " + clientHost + " Client port = " + clientPort);
	                
	                // Read data from the client
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                String msgFromClient = br.readLine();
	                OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    ResultSet ansMsg = searchById(Integer.parseInt(msgFromClient));
                    System.out.println(ansMsg);
                    pw.println(ansMsg);
	                //System.out.println("Message received from client = " + msgFromClient);
	                
	                // Send response to the client
	                /*if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
	                    OutputStream clientOut = client.getOutputStream();
	                    PrintWriter pw = new PrintWriter(clientOut, true);
	                    String ansMsg = "Hello, " + msgFromClient;
	                    pw.println(ansMsg);
	                }
	                
	                // Close sockets
	                if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
	                    server.close();
	                    client.close();
	                    break;
	                }*/
	                
	            } catch (IOException ie) {
	            }
	        }
	    }

		public int getFactorial(int n) {
			// TODO Auto-generated method stub
			int i,fact=1;  
  
			  for(i=1;i<=n;i++){    
			      fact=fact*i;    
			  }    
			  //System.out.println("Factorial of "+n+" is: "+fact);    
			   
			return fact;
		}

		public void addEmployee(int id,String firstName,String lastName,String email) throws SQLException {
			// TODO Auto-generated method stub
			EmployeeService emp=new EmployeeServiceImpl();
			emp.createEmployee(new Employee(id,firstName,lastName,email));
		}

		public static ResultSet searchById(int id) throws SQLException 
			{
				int i=id;
				ResultSet rs= null;
				RS2XMLConfig rc=new RS2XMLConfig();
				try {
					rs=rc.searchById(i);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				return rs;
	
			}
	}

