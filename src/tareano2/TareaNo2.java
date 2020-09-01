package tareano2;
import java.util.Scanner;

public class TareaNo2 {
    
    public static Estudiantes [] estudiante = new Estudiantes [11];
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
            System.out.println("-----------------------------");
            System.out.println("Ingrese una opción");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Modificar datos");
            System.out.println("3. Eliminar datos");
            System.out.println("4. Listado de Estudiantes");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESAR DATOS");
                    if(cuan<=10){
                         Ingresar();
                    }else{
                        System.out.println("Espacio agotado");
                    }
                        
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
                    System.out.println("LISTADO");
                    Listado();
                case 5:
                   
                    break;
                default:
                    System.out.println("Ingrese una opción valida");;
            }
        } while (opcion != 5);
        
    }
    
    public static void Ingresar(){
        Scanner cd = new Scanner(System.in);
        Estudiantes reco_estudiante = new Estudiantes();
         
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = cd.nextLine();
        System.out.print("Ingrese el carnet: ");
        carnet = Integer.parseInt(cd.nextLine());
        System.out.print("Ingrese la nota: ");
        nota = Integer.parseInt(cd.nextLine());
            
        estudiante[cuan] = new Estudiantes(nombre,carnet,nota);
        cuan++;
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
        int verify_carnet,encontrado;
        int posicion = 0;
        Estudiantes eliminar_estudiante = new Estudiantes();
        System.out.print("Ingrese el carnet a eliminar: ");
        verify_carnet = num.nextInt();
        encontrado=buscarAlumno(verify_carnet);
        for (int i = encontrado; i < cuan; i++) {
            estudiante[i] = estudiante[i+1];
        }                                                                      // la posicion por los datos anteriro (reinscripcion y eliminacion de un espacio
        System.out.println("Registro eliminado"); 
        cuan--;
    }
    private static int buscarAlumno(int carnet) {
        int an =-1;
        for (int i = 0 ;i<cuan; i++){                                                     //pos = posicion de lo encantro 
            if(estudiante[i].getCarnet()==carnet){                                      //busqueda en posiciones para poder inmprimir posicion
                System.out.println("Registro encontrado!");
                an=i;
            }
        }
        if(an==-1){
                System.out.println("No hay Registro");
        }
        return an;
    }
    private static void Listado() {
       for (int i=0;i<cuan;i++){
           System.out.println("-----------------------------");
            System.out.println(estudiante[i].toString());
        }
    }

}
