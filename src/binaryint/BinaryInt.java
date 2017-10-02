/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryint;

import java.util.ArrayList;

/**
 *
 * @author pbibus
 */
public class BinaryInt extends ArrayList<Integer> implements Comparable{

    /**
     * @param args the command line arguments
     */
    public BinaryInt(){
        int num = (int)(Math.random() * Integer.MAX_VALUE);
        getBin(num);
        
        
        //System.out.println(bin);
    }
    
    public BinaryInt(int num){
        //String bin = Integer.toBinaryString(num);
        getBin(num);
        //System.out.println(bin);
    }
    
    @Override
    public String toString(){
        
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryInt bint = new BinaryInt();
        //BinaryInt bint2 = new BinaryInt();
        //BinaryInt bint3 = new BinaryInt();
        //binAdd(bint, bint2);
        System.out.println(bint.toString());
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static BinaryInt binAdd(BinaryInt first, BinaryInt second){
        BinaryInt compared = new BinaryInt();
        int carry = 0;
        int caseCarry = 0;
        for(int parser = 31; parser > 0; parser--){
            caseCarry = carry + first.get(parser) + second.get(parser);
            switch(caseCarry){
                case 0:
                    compared.set(parser, 0);
                    carry = 0;
                    break;
                case 1:
                    compared.set(parser, 1);
                    carry = 0;
                    break;
                case 2:
                    compared.set(parser, 0);
                    carry = 1;
                    break;
                case 3:
                    compared.set(parser, 1);
                    carry = 1;
                    break;  
            }
        }
        System.out.println(compared.toString());
        return compared;
    }
    
    
    public void getBin(int n){
            if(n > 0){
                getBin(n / 2);
                this.add(n % 2);
            }else while(this.size() < 32){
                this.add(0);
            }
        
    }
    
}
