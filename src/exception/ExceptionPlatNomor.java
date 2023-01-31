

package exception;

/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public class ExceptionPlatNomor extends Exception {
    public ExceptionPlatNomor() {
        super("Plat nomor harus diawali dengan AB [!]");
    }
}
