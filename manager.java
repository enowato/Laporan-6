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
public class manager extends employee {
    private long tunjanganmanajer;
    private long lamakrj,tunjangan,tunjanganistri=0,tunjangananak=0,gajittl;
    public void lamakerja(int a){
        if(a<5){
            lamakrj=0;
            tunjangan=0;
        }
        else if (a>5&&a<=10){
            lamakrj=a*5*gaji/100;
            tunjangan=0;
        }
        else if (a>10){
            lamakrj=a*10*gaji/100;
            tunjangan=a*10*gaji/100;
        }
        gajittl=gaji+lamakrj+tunjangan;
    }
    public void tunjanganistri(){
        tunjanganistri=gajittl*10/100;
        gajittl=gajittl+tunjanganistri;
    }
    public void tunjangananak(int a){
        tunjangananak=gajittl*15/100;
        if(a<4){
            tunjangananak=tunjangananak*a;
        }
        else{
            tunjangananak=tunjangananak*3;
        }
        gajittl=gajittl+tunjangananak;
    }
    public void tunjanganmanajer(){
        tunjanganmanajer=gajittl*10/100;
        gajittl=gajittl+tunjanganmanajer;
    }
    public void display(){
        System.out.println("gaji anda sebesar: "+gajittl);
        System.out.println("detail:");
        System.out.println("\t-gaji pokok: "+gaji);
        System.out.println("\t-bonus lama kerja: "+lamakrj+"\n\t-tunjangan tambahan: "+tunjangan);
        System.out.println("\t-tunjangan istri sebesar: "+tunjanganistri);
        System.out.println("\t-tunjangan anak sebesar: "+tunjangananak);
        System.out.println("\t-tunjangan manajer sebesar: "+tunjanganmanajer);
    }
}
