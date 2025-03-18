package DSA;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // for(int i = 0;i<4;i++){
        //     System.out.println("vaibhav");
        // }
        //loop basic (forloop)
        //   for(int i=1; i<=10;i++){
        //     if(i%2 ==0 ){
        //         System.out.println("prime number");
        //     }
        //     else{
        //     System.out.println(i);
        //     }
        // }
        // loop with if else
        // for(int i=1; i<=20; i++){
        //     System.out.println(i*19);
        // }
        // Table Printing 
        // for(int i=1; i<=11; i=i+3){
        //     System.out.println(i);
        // }
        //ap printing 
        // for(int i = 1 ; i<=60; i++){
        //     if(60%i==0){
        //     System.out.println(i);
        //     }
        // }
        // Sloving how to count no of digit 
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int x = 0;
        // if (n==0){
        //     x++;
        //     }
        //     for(;n!=0; ){
        //         n=n/10;    
        //         x++;
        //     }
        //     System.out.println(x);
        // sum of given number 
        // print sum of digits of a given number 
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y =0;
        // int z = 0;
        // if (x==0) {
        //     System.out.println(x);
        // }
        // else {
        //     for(;x!=0;){
        //         y=x%10;
        //          z= z+y;
        //          x =x/10;

        //     }
        // }
        // System.out.println(z);
        //making the digit reverse 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int y=1;
        // int z = 1;
        // if (x==0) {
        //     System.out.println(x);
        // }
        // else{
        //     for(;x!=0;){
        //         y=x%10;
        //         z=y*10;
        //         z=z+y;
        //         x=x/10;
        //     }
        // }
        // System.out.println(z);
        // FActorial of a number 
        int y=1;
        for(int i =1;i<=x; i++ ){
            y=y*i;
        }
        System.out.println(y);
    
    }


}
