import java.io.*;
import java.net.*;
import java.nio.Buffer;
import java.util.Scanner;

public class TCPServer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ServerSocket ss = new ServerSocket(5050);    
            System.out.println("server online ...");  
            
            Socket s = ss.accept();
            System.out.println("Client is connected ...");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
           
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

             String sendMessage = sc.nextLine();
             pw.println(sendMessage);

            String msg = br.readLine();
            System.out.println("(client) : "+msg);

            pw.println("Message read ...");
        } catch (Exception e) {

            e.printStackTrace();
        }
        
    }
}