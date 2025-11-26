import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(6060); 
            byte [] buffer = new byte[1024];

            DatagramPacket dgp = new DatagramPacket(buffer,buffer.length);
            System.out.println("#Server is online !");

            ds.receive(dgp);
            String message = new String (dgp.getData(),0,dgp.getLength());
            System.out.println("Client Sent :"+ message);

            String reply = "over and out!!";
            byte[] sendData= reply.getBytes();
            DatagramPacket dpSend  = new DatagramPacket(sendData, sendData.length,dgp.getAddress(),dgp.getPort());
            
            ds.send(dpSend);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
