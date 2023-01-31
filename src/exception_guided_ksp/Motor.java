

package exception_guided_ksp;

import exception.ExceptionMerk;
import exception.ExceptionPlatNomor;
import exception.ExceptionWarna;

/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public class Motor extends Kendaraan {
    private String merkMotor;

    public Motor(String merkMotor, String platNomor, String warna) throws ExceptionPlatNomor, ExceptionWarna, ExceptionMerk {
        super(platNomor, warna);
        
        if(merkMotor.equals("")){
            
            throw new ExceptionMerk("Merk Motor Tidak Boleh Kosong [!]");
            
        }else{
            
            this.merkMotor = merkMotor;
            
        }
        
    }
    
    
    

    @Override
    public void showData() {
        System.out.println("--------MOTOR-------");
        System.out.println("Merk : " + this.merkMotor);
        System.out.println("Plat Nomor : " + super.platNomor);
        System.out.println("Warna : " + super.warna);
    }
    
}
