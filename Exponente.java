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
public class Exponente {

int exp,base;
    public Exponente(int base, int exp) {
        this.base = base;
        this.exp = exp;
    }
    public int exp(){
        int res;
        res=(int) Math.pow(base, exp);
        return res;
    }
}
