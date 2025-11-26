import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");

            String msg = "Client is inbound"; 
            byte[] sendData = msg.getBytes(); 

            DatagramPacket dp = new DatagramPacket
            (sendData, sendData.length,ip,6060);
            ds.send(dp);

            byte[] buffer =new byte[1024];
            DatagramPacket rec = new DatagramPacket(buffer, buffer.length);
            ds.receive(rec);

            String reply = new String(rec.getData(),0,rec.getLength());
            System.out.println("#Server :"+reply);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
