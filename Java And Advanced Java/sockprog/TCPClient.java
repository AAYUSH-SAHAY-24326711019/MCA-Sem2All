import java.io.*;
import java.net.*;


public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",5050);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

            pw.println("Hello Server !!!");

            String reply = br.readLine();
            System.out.println("#Server > "+reply);
             reply = br.readLine();
            System.out.println("#Server > "+reply);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
