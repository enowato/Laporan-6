/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprktkm6;

/**
 *
 * @author Lenovo
 */
public class pegawaitidaktetap extends employee {
    private int lembur=0;
    private long total;
    public void lembur(int a){
        if (a>10){
            int j=a-10;
            lembur=j*10000;
            total=gaji+lembur;
        }
        else{
            total=gaji;
        }
    }
    public void display(){
        System.out.println("total gaji: "+total);
        System.out.println("detail:");
        System.out.println("\t-gaji pokok: "+gaji);
        System.out.println("\t-lembur: "+lembur);
    }
}
