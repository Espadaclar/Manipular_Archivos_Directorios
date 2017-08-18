
import java.io.*;
/**
 * @author franciscoJavier
 */
public class Escribir_En_Fichero {

    public static void main(String[] args) {
        // RUTA DEL ARCHIVO en el que se escribe.
        File ruta = new File("C:" +File.separator+ "Users" +File.separator+ "Usuario" +File.separator+ "Desktop" 
                                                            +File.separator+ "Nueva_Car" +File.separator+ "reloj.txt");
        try {
            ruta.createNewFile();// MT PARA CREAR ARCHIVO
        } catch (Exception ex) {
            System.out.println("herror en ruta.");
        }
        //INSTACIA DE LA CL, QUE ESCRIBE DATOS EN UN ARCHIVO.
        Escribir s = new Escribir();
        String ruta2 = ruta.getAbsolutePath();//OBTIENE LA RUTA DEL ARCHIVO en el que escribe, EN UN STRING.
        s.escribiendo(ruta2, "//////////// MOKU YOKU SHIN THAY, SHIN YIM MOKU, TO GAN SHU JHO, DAN JO BONNO KURIO YAKU METSHU. //////////////");
    }  
}

class Escribir{
    /**
     * ESCRIBE DATOS EN UN ARCHIVO.
     * @param ruta lugar donde se encuentra el archivo.
     * @param datosParaElArchivo datos para escribir en el archivo.
     */
    public void escribiendo(String ruta, String datosParaElArchivo){
        try {
            FileWriter escribe = new FileWriter(ruta, true);           
            //BUCLE PARA RECORRER EL PARAMETRO 'datosParaElArchivo' CARACTER A CARACTER.
            for(int i = 0; i < datosParaElArchivo.length(); i ++){
                escribe.write(datosParaElArchivo.charAt(i));
            }
            escribe.close();// cierre del flujo de datos.
        } catch (IOException ex) {
            System.out.println("herror. ");
        }
    }
}
