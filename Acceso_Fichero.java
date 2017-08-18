import java.io.*;

/**
 *Accede a una carpeta o ficheros y muestra el contenido del mismo
 * @author Usuario
 */
public class Acceso_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //COMO INSPECCIONAR LOS ARCHIVO QUE TENEMOS EN UNA CARPETA
        // 1º Ponemos la ruta de la carpeta en un objeto File
        //File ruta = new File("D:\\01 Tutorial_Java_Aplicaciones\\JavaApplication96_Prueba_Rutas");
        // --VARIABLE 'File.Separator' PARA QUE LA RUTA SEA VALIDA EN TODOS LOS SO.
        File ruta = new File("D:" +File.separator+ "01 Tutorial_Java_Aplicaciones" +File.separator+ "JavaApplication96_Prueba_Rutas");
        //hacemos una comprobacion de la ruta y si existe la carpeta
        System.out.println("=== RUTA DE LA CARPETA ---> " +ruta.getAbsolutePath());
        System.out.println("=== EXISTE LA CARPETA ---> " +ruta.exists());
        System.out.println("-----------------------------");

        // 2º utilizamos el mt 'list()' que devuelve un array con el contenido de la carpeta.
        //    lo almacenamos en otro array.
        String[] nombres_archivos = ruta.list();
        for (String datos : nombres_archivos) {
           //nueva instancia de File con otro de sus constructores, para inspeccionar los posibles directorios
            // que pueda haber dentro de --> "C:\\Users\\Usuario\\Desktop\\Prueba\00_PROYECTOS\7 Mi_Excepcion"
            //ruta.getAbsolutePath() almacena en f --> "C:\\Users\\Usuario\\Desktop\\Prueba\00_PROYECTOS\7 Mi_Excepcion"
            // datos almacena en f --> el nombre del objeto datos de cada iteración.
            File f = new File(ruta.getAbsolutePath(), datos);
            if (f.isDirectory()) {
                System.out.println("\n.- " +datos+ " -. es un directorio de la carpeta con contenido: ");
                String[] archivos_subCarpeta = f.list();
                for (String datos2 : archivos_subCarpeta) {
                    System.out.println("_______"+datos2);   
                }
                System.out.println("::::::::::::::::::::");
            } 
            else {
                System.out.println(".- " +datos+ " -. es un rchivo de la carpeta");
            }
        }
    }
}
