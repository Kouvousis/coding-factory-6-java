package gr.aueb.cf.ch25;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends Thread {

    @Override
    public void run() {
        ServerSocket serveFd = null;
        final int SERVER_PORT = 7;

        try {
            serveFd = new ServerSocket();
            serveFd.bind(new InetSocketAddress("127.0.0.1", SERVER_PORT));
            System.out.println("Server Started ...");

            while (true) {
                Socket connectedFd = serveFd.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(connectedFd.getInputStream()));
                PrintWriter pw = new PrintWriter(connectedFd.getOutputStream());
                String line = "";

                do {
                    line = br.readLine();
                    pw.println(line);
                    pw.flush();
                } while (!line.equals("BYE"));
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serveFd != null) serveFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
