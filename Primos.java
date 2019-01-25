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
public class Primos {
    int a;

    public Primos(int a) {
        this.a = a;
    }
    public int prim(){
        int res;
        res=a&1;
        if(res==0){
          System.out.println("SI es primo");  
        }else{
          System.out.println("NO es primo");  
        }
        return res;
    
}
}
