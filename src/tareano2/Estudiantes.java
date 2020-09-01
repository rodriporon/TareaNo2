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

    @Override
    public String toString() {
        return   "\ncarnet=" + carnet 
                + "\n nombre=" + nombre 
                + "\n nota=" + nota ;
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
        int posicion = 0;
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
        } while (posicion != 0);
        
    }
    
    public int BuscarEstudiante(Estudiantes[] estudiante, int carnet,int c){
       int pos =0;
        for (int i = 0 ;i<c; i++){                                                      
            if(estudiante[i].getCarnet()==carnet){                                      //busqueda en posiciones para poder inmprimir posicion
                System.out.println("Registro encontrado!");
                pos=i;
            }
        }
        if(pos==-1){
                System.out.println("No hay Registro");
        }
        return pos;
        
    }
    
    
    /**
     *
     * @param arrayObjetos
     * @param i
     * @return
     */
    
}
