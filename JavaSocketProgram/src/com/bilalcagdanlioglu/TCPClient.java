package com.bilalcagdanlioglu;

import java.io.*;
import java.net.*;



public class TCPClient {
    
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",1234);
        DataOutputStream dout= new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("TCP Client message: ");
            String so = br.readLine();
            dout.writeUTF(so);
            if(so.equalsIgnoreCase("bye")){
                break;
            }
        }
        s.close();
    }
}