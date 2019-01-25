/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaicones;

/**
 *
 * @author UGT
 */
public class Fibonacci {
    int fib;

    public Fibonacci(int fib) {
        this.fib = fib;
    }
    public int fibo(){
        int a=0,f=0;
        for(int i=0;i<=fib;i++){
            a=i+f;
            f=a;
        }
        fib=a;
        System.out.println("EL numero de la serie es:");
        return fib;
        
    }
}
