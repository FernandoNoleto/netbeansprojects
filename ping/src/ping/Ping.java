/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ping;

/**
 *
 * @author Fernando
 */
public class Ping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        counter c = new counter();
        c.ping();
        c.ping();
        
        int v = c.val();
        System.out.println("v: " +v);
        
        ginp g = new ginp();
        char t = g.count;
        int i = c.count;
        
        System.out.println("t: "+t);
        System.out.println("i: "+i);
        g.foo();
    }
    
}
