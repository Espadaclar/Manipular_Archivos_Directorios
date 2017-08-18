
import java.io.*;

/**
 * 1º CREA UN DIRECTORIO
 * @author franciscoJavier
 */
public class Crea_Directoiro_Fichero
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // RUTA DONDE SE CREA EL ARCHIVO.
        File ruta = new File("C:" +File.separator+ "Users" +File.separator+ "Usuario" +File.separator+
                                    "Desktop" +File.separator+ "Nueva_Car2" +File.separator+ "relojes2.txt");
        try {
            ruta.createNewFile();
        } catch (IOException ex) {
            System.out.println("herror.");
        }
        //ruta.mkdir();
        
    }
    
}