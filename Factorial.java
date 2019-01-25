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
public class Factorial {
    int fac;
 
    public Factorial(int fac) {
        this.fac= fac;
    }
        public int fac(){
        int factorial=1;
        for(int i=1;i<=fac;i++)
            factorial=factorial*i;
        return factorial;
    }
}
