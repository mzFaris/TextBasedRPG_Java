package com.model;

import java.util.Scanner;

public class SuperV {

    private String email;
    private static String password;
    private static final Scanner scanner = new Scanner(System.in);

    public SuperV(){
        // this.email = email;
        // this.password = password;
    }  

    public void setEmail(){
        //.replace() ini buat ignore space akhir baris tergantung kondisi
        // this.email = scanner.nextLine().replaceAll("\\s+$", "");

        //.trim() ini buat ignore spasi awal dan akhir pada kalimat.
        this.email = scanner.nextLine().trim();

    }

    public void setPassword(){
        password = scanner.nextLine();
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

}
