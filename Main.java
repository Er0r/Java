/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynew.udemy;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char charArray[] ={ 'H','E','L','L','O','W','O','R','L','D','\0'};
        char copyto[] =new char[20];
        System.arraycopy(charArray,5,copyto,0,6);
        System.out.println(new String(copyto));
    }
    
}
