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
import java.util.Scanner;
public class testclass {
    public static void main(String[] args) {
        int n1=0,n2=0,n3=0;
        manager m[]=new manager[10];
        pegawaitetap p[]=new pegawaitetap[50];
        pegawaitidaktetap pgt[]=new pegawaitidaktetap[50];
        String jwb;
        Scanner masuk=new Scanner(System.in);
        do{
            employee karyawan=new employee();
            System.out.print("masukan nama: ");
            String a=masuk.next();
            System.out.print("masukan idkerja: ");
            long b=masuk.nextLong();
            System.out.println("1. manajer\n2. pegawai tetap\n3. pegawai tidak tetap");
            System.out.print("masukan jabatan: ");
            int c=masuk.nextInt();
            switch(c){
                case 1: m[n1]=new manager();
                    System.out.print("masukan lama kerja: ");
                    int d=masuk.nextInt();
                    m[n1].lamakerja(d);
                    System.out.print("apakah punya istri(y/n): ");
                    String istri=masuk.next();
                    if(istri.equalsIgnoreCase("y")){
                        m[n1].tunjanganistri();
                    }
                    System.out.print("apakah punya anak(y/n): ");
                    String anak=masuk.next();
                    if(anak.equalsIgnoreCase("y")){
                        System.out.print("banyak anak: ");
                        int u=masuk.nextInt();
                        m[n1].tunjangananak(u);
                    }
                    m[n1].tunjanganmanajer();
                    System.out.println("----------------------------------------------");
                    m[n1].display();
                    n1++;break;
                case 2: p[n2]=new pegawaitetap();
                    System.out.print("masukan lama kerja: ");
                    int f=masuk.nextInt();
                    p[n2].lamakerja(f);
                    System.out.print("apakah punya istri(y/n): ");
                    String istri2=masuk.next();
                    if(istri2.equalsIgnoreCase("y")){
                        p[n2].tunjanganistri();
                    }
                    System.out.print("apakah punya anak(y/n): ");
                    String anak2=masuk.next();
                    if(anak2.equalsIgnoreCase("y")){
                        System.out.print("banyak anak: ");
                        int u=masuk.nextInt();
                        p[n2].tunjangananak(u);
                    }
                    System.out.println("----------------------------------------------");
                    p[n2].display();
                    n2++;break;
                case 3: pgt[n3]=new pegawaitidaktetap();
                    System.out.print("masukan banyak jamkerja: ");
                    int g=masuk.nextInt();
                    pgt[n3].lembur(g);
                    System.out.println("----------------------------------------------");
                    pgt[n3].display();
            }
            System.out.print("apakah ingin memasukan data lagi?(y/n) ");
            jwb=masuk.next();
            System.out.println("==============================================");
        }while(jwb.equalsIgnoreCase("y")) ;
    }
}
