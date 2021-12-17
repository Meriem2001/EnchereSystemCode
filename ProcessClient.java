package mini_projet1;


import java.io.*;

import java.net.*;



public class ProcessClient {

    public static void main(String[] args) throws IOException {

        DatagramSocket sc=new DatagramSocket();



        Mbrsend ss=new Mbrsend(sc);

        ss.start();



        Mbrrecv sr=new Mbrrecv(sc);

        sr.start();

    }

}