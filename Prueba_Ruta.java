
import java.io.File;

/**
 *Manipular archivos y ficheros de la máquina huesped es donde se esta ejecutando el programa,
 *poder ver los directorios, archivos, ficheros y carpetas de la máquina, modificarlos, eliminarlos.
 *Utilizaremos la cl ‘File’  Prueba_Ruta.java

 * @author Usuario
 */
public class Prueba_Ruta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File archivo = new File("build");//al no especificar una ruta, java toma por defecto la ruta donde se encuentra el proyecto 
        System.out.println(archivo.getAbsoluteFile());// nos devuelve la ruta donde debe de encontrarse el fichero aunque no exista.
        System.out.println(archivo.exists());// nos dice si existe el fichero en la ruta donde se encuentra.
        System.out.println("---------------------------------------");
        
        File archivo2 = new File("Prueba_Ruta.java");//al no especificar una ruta, java toma por defecto la ruta donde se encuentra el proyecto 
        System.out.println(archivo2.getAbsoluteFile());// nos devuelve la ruta donde debe de encontrarse el fichero aunque no exista.
        System.out.println(archivo2.exists());// nos dice si existe el fichero en la ruta donde se encuentra.
    }
    
}
