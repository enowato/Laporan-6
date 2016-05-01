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
    public void tunjangananak(){
        tunjangananak=gajittl*15/100;
        gajittl=gajittl+tunjangananak;
    }
    public void tunjanganmanajer(){
        tunjanganmanajer=gajittl*10/100;
        gajittl=gajittl+tunjanganmanajer;
    }
    public void display(){
        System.out.println("gaji anda sebesar: "+gajittl);
        System.out.println("bonus lama kerja: "+lamakrj+" tunjangan tambahan: "+tunjangan);
        System.out.println("tunjangan istri sebesar: "+tunjanganistri);
        System.out.println("tunjangan anak sebesar: "+tunjangananak);
        System.out.println("tunjangan manajer sebesar: "+tunjanganmanajer);
    }
}
