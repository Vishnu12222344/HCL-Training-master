package javapractice;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class TryWithResource {
    public static void main(String[] args) throws IOException {

        // Very old version of taking input
//        int num= System.in.read();  // it will give ascii value of that number, and also it reads only first character.
//        System.out.println(num);

        // before java 1.5
//        InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader bf=new BufferedReader(in); // it will return string. So we need to convert into number.
//
//        int num= Integer.parseInt(bf.readLine());
//        System.out.println(num);

        // After 1.5
//        Scanner s=new Scanner(System.in);
//        int num=s.nextInt();
//        System.out.println(num);

        // using try with resource

//        BufferedReader bf = null;
        // manually we need to close this BufferStreamReader using finally.Instead, we can use this.
//        try {
//            InputStreamReader in = new InputStreamReader(System.in);
//            bf = new BufferedReader(in);
//        } finally {
//            bf.close();
//        }
        try(BufferedReader bf= new BufferedReader(new InputStreamReader(System.in))){   // It will automatically close BufferReader.
            int num= Integer.parseInt(bf.readLine());
            System.out.println(num);

        }

    }
}
