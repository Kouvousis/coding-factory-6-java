package gr.aueb.cf.ch25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *  Iterative server.
 */
public class DateTimeServer extends Thread {

    @Override
    public void run() {
        ServerSocket serverFd;
        int serverPort = 13;

        try {
            serverFd = new ServerSocket();
            serverFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 50);

            while (true) {
                Socket connectedFd = serverFd.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write(new Date().toString());
                bw.flush();
                connectedFd.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
