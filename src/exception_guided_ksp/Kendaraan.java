

package exception_guided_ksp;

import exception.ExceptionPlatNomor;
import exception.ExceptionWarna;


/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public abstract class Kendaraan {
    protected String platNomor;
    protected String warna;

    public Kendaraan(String platNomor, String warna) throws ExceptionPlatNomor, ExceptionWarna  {
        if(!(platNomor.startsWith("AB"))){
        
            throw new ExceptionPlatNomor();
            
        }else if (warna.length() >= 10){
            
            throw new ExceptionWarna();
            
        }else{
            
            this.platNomor = platNomor;
            this.warna = warna;
            
        }
        
    }
    
    public abstract void showData();
}
