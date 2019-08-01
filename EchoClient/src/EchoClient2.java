import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class EchoClient2 {
    private static SocketChannel client;
    private static ByteBuffer buffer;
    private static EchoClient2 instance;
 
    public static EchoClient2 start() {
        if (instance == null)
            instance = new EchoClient2();
 
        return instance;
    }
 
    public static void stop() throws IOException {
        client.close();
        buffer = null;
    }
 
    private EchoClient2() {
        try {
            client = SocketChannel.open(new InetSocketAddress("localhost", 5454));
            buffer = ByteBuffer.allocate(256);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public String sendMessage(String msg) {
        buffer = ByteBuffer.wrap(msg.getBytes());
        String response = null;
        try {
            client.write(buffer);
            buffer.clear();
            client.read(buffer);
            response = new String(buffer.array()).trim();
            System.out.println("response=" + response);
            buffer.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
 
    }
    public static void main(String[] args)  {
    	EchoClient2.start();
    	EchoClient2.sendMessage("안녕");
    }  
}


