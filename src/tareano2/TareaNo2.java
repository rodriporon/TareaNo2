package tareano2;
import java.util.Scanner;

public class TareaNo2 {
    
    public static Estudiantes [] estudiante = new Estudiantes [3];
    public static String nombre;
    public static int carnet;
    public static int nota;
    public static int cuan=0;

    public static void main(String[] args) {
        
        Menu();

    }
    
    public static void Menu(){
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Modificar datos");
            System.out.println("3. Eliminar datos");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESAR DATOS");
                    Ingresar();
                    break;
                case 2:
                    System.out.println("MODIFICAR DATOS");
                    Modificar();
                    break;
                case 3: 
                    System.out.println("ELIMINAR DATOS");
                    Eliminar();
                    break;
                case 4:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");;
            }
        } while (opcion != 4);
        
    }
    
    public static void Ingresar(){
        Scanner cd = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        
        Estudiantes reco_estudiante = new Estudiantes();
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = cd.nextLine();
            System.out.print("Ingrese el carnet: ");
            carnet = sc.nextInt();
            System.out.print("Ingrese la nota: ");
            nota = sc.nextInt();
            
            estudiante[i] = new Estudiantes(nombre,carnet,nota);
            cuan++;
        }
        //reco_estudiante.LeerNombres(estudiante);
        
    }
    public static void Modificar(){
        Scanner num = new Scanner(System.in);
        
        int verify_carnet;
        int quien;
        Estudiantes reco_carne = new Estudiantes();
        
        System.out.print("Ingrese el carnet del estudiante: ");
        verify_carnet =Integer.parseInt(num.nextLine());
        quien = reco_carne.BuscarEstudiante(estudiante, verify_carnet,cuan);
        
        String nombre= null;
        int nota1 = 0;
        System.out.println("-------------------------");
        System.out.println("Nuevo Nombre: ");                                   //Encontrada la pocion se le notifica el nuevo nombre y nota
        nombre= num.nextLine();
        System.out.println("-------------------------");
        System.out.println("Nueva Nota: ");
        nota1= Integer.parseInt(num.nextLine());
        estudiante[quien].setNombre(nombre);
        estudiante[quien].setNota(nota1);           
    }
    
    public static void Eliminar(){
        Scanner num = new Scanner(System.in);
        
        int verify_carnet;
        int posicion = 0;
        Estudiantes eliminar_estudiante = new Estudiantes();
        System.out.print("Ingrese el carnet a eliminar: ");
        verify_carnet = num.nextInt();
        eliminar_estudiante.EliminarEstudiante(estudiante,verify_carnet,cuan);
    }
    /*public static void Ver(){    Solo queria saver que datos gurdavas

        for (int i=0;i<cuan;i++){
            System.out.println(estudiante[i].toString());
        }
    }*/

}
