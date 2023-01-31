

package exception_guided_ksp;

import exception.ExceptionMerk;
import exception.ExceptionPlatNomor;
import exception.ExceptionWarna;

/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public class Mobil extends Kendaraan {

    private String merkMobil;

    public Mobil(String merkMobil, String platNomor, String warna) throws ExceptionPlatNomor, ExceptionWarna, ExceptionMerk {
        super(platNomor, warna);
        
        if(merkMobil.equals("")){
            
            throw new ExceptionMerk("Merk Mobil Tidak Boleh Kosong [!]");
            
        }else{
            
            this.merkMobil = merkMobil;
            
        }
        
    }
    
    
    

    @Override
    public void showData() {
        System.out.println("--------MOBIL-------");
        System.out.println("Merk : " + this.merkMobil);
        System.out.println("Plat Nomor : " + super.platNomor);
        System.out.println("Warna : " + super.warna);
    }
    
}
