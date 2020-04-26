package cn.itcast.day07.demo06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author hkl
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好".getBytes());
        InputStream inputStream = socket.getInputStream();
        int read = inputStream.read();
        System.out.println(read);
        socket.close();
    }
}
