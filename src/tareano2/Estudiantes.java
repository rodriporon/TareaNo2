package tareano2;
import java.util.Scanner;

public class Estudiantes {
    
   private int carnet;
   private String nombre;
   private int nota;

    public Estudiantes() {
        
    }
   
   

    public Estudiantes(String nombre, int carnet, int nota) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.nota = nota;
        System.out.println("Creaste un estudiante");
    }
   
   
    /**
     * @return the carnet
     */
    public int getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void LeerNombres(Estudiantes[] estudiante){
        System.out.println("Los nombres que ingresó");
        for (int i = 0; i < 2; i++) {
            System.out.println(estudiante[i].getNombre());
        }
    }
    
    public void LeerCarnet(Estudiantes[] estudiante, int obtener_nota){
        Scanner cad = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        int verify_carnet;
        int posicion = null;
        for (int i = 0; i < 2; i++) {
            verify_carnet = estudiante[i].getCarnet();   
            if (verify_carnet == obtener_nota) {
                posicion = i;
            }
            else{
                System.out.println("No se ha encontrado al estudiante");
            }
        }
            do {
                System.out.println("Esto solo se deberia ejecutar si se encontró el carnet");
        } while (posicion != null);
        
    }
    
    public void BuscarEstudiante(Estudiantes[] estudiante, int carnet){
        
        int posicion = 0;
        int verify_carnet;
        for (int i = 0; i < 2; i++) {
            verify_carnet = estudiante[i].getCarnet();
            if (verify_carnet == carnet) {
                posicion = i;
                
            }
            
        }
        for (int i = posicion; i < 1; i++) {
            estudiante[i] = estudiante[i+1];
        }
        System.out.println("Registro eliminado");
        posicion--;
        
    }
    
    public void EliminarEstudiante(int i){
        
        
    }
    
    /**
     *
     * @param arrayObjetos
     * @param i
     * @return
     */
    
}
