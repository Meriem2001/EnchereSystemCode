package mini_projet1;

import java.io.*;

import java.net.*;



public class Mbrsend extends Thread{

    DatagramSocket sc;



    public Mbrsend(DatagramSocket sc) {

        this.sc = sc;

    }

    public void run(){

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            try {

                String msg=in.readLine();

                DatagramPacket pk=new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getLocalHost(), 3000);

                sc.send(pk);

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }

}