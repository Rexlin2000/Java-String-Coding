//convert Given String onto uppercase and lowercase without using String Method


import java.util.Scanner;

public class Convertstring {

    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sg=new Scanner(System.in);
        String sc=sg.next();
        for(int i=0;i<sc.length();i++){
            int ch=sc.charAt(i);
            if(ch>=65&&ch<=90){// Uppercase using ascii table
                ch=ch+32;
                System.out.print((char)ch);
            }
            else if(ch>=97&&ch<=122){//lowercase using ascii table
                ch=ch-32;
                System.out.print((char)ch);
                
            }
            
        }
        System.out.println();
    }
}
