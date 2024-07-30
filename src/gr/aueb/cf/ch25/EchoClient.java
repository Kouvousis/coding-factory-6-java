package gr.aueb.cf.ch25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {
        Socket sockFd = null;

        try (Scanner in = new Scanner(System.in)) {
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            final int SERV_PORT = 7;

            sockFd = new Socket(serverAddress, SERV_PORT);
            PrintWriter pw = new PrintWriter(sockFd.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sockFd.getInputStream()));
            String line = "";

            do {
                line = in.nextLine();
                pw.println(line);
                pw.flush();
                System.out.println(br.readLine());
            } while (!line .equals("BYE"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sockFd != null) sockFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}