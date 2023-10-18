import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
            Estudiante estudiante1 = new Estudiante();
            /*
            estudiante1.ingresarDatosEstudiante();
            estudiante1.ingresarMateria();
            estudiante1.imprimirMaterias();
            //estudiante1.imprimirTodosProfesores();

             */
            estudiante1.ingresarDatosEstudiante();
            estudiante1.ingresarMateria(1);
            estudiante1.ingresarMateria(2);
            estudiante1.ingresarMateria(3);
            estudiante1.imprimirDatosEstudiante();
            estudiante1.imprimirMaterias();
        }
    }
