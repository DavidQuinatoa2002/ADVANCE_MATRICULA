import java.util.Scanner;
public class Estudiante {
    private int numero_matricula=0;
    private String cedula_est="";
    private String nombre_est="";
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;


    //-----------------------

    public int getNumero_matricula() {return numero_matricula;
    }
    public void setNumero_matricula(int numero_matricula) {this.numero_matricula = numero_matricula;
    }
    public String getCedula_est() {return cedula_est;
    }
    public void setCedula_est(String cedula_est) {this.cedula_est = cedula_est;
    }
    public String getNombre_est() {return nombre_est;
    }
    public void setNombre_est(String nombre_est) {this.nombre_est = nombre_est;
    }
    public Materia getMateria1() {return materia1;
    }

    public void setMateria1(Materia materia1) {this.materia1 = materia1;
    }
    public Materia getMateria2() {return materia2;
    }
    public void setMateria2(Materia materia2) {this.materia2 = materia2;
    }
    public Materia getMateria3() {return materia3;
    }
    public void setMateria3(Materia materia3) {this.materia3 = materia3;
    }



    //-----------
    public Estudiante(){

    }

    public Estudiante(int numero_matricula, String cedula_est, String nombre_est, Materia materia1, Materia materia2, Materia materia3) {
        this.numero_matricula = numero_matricula;
        this.cedula_est = cedula_est;
        this.nombre_est = nombre_est;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }



    //---------------
    public void ingresarDatosEstudiante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre_est = sc.next();
        System.out.println("Ingrese el numero de matricula del estudiante: ");
        int numero_matricula = sc.nextInt();
        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula_est = sc.next();
    }

    public void imprimirDatosEstudiante(){
        System.out.println("Nombre: "+nombre_est);
        System.out.println("Matricula: "+numero_matricula);
        System.out.println("Cedula: "+cedula_est);
    }



    //-------------------------------

    public void ingresarMateria(int i){
        if(i==1){
            System.out.println("-----------------------------");
            materia1 = new Materia();
            materia1.ingresarDatos(i);
            materia1.ingresarProfesor(1);
        }else if(i==2){
            materia2 = new Materia();
            materia2.ingresarDatos(i);
            materia2.ingresarProfesor(2);
        }else{
            materia3 = new Materia();
            materia3.ingresarDatos(i);
            materia3.ingresarProfesor(3);
        }
    }


    //-----------------
    /*
    public void imprimirTodosProfesores(){
        String nomMateria1Profesor1 = materia1.getProfesor1().getNombre_prof();
        System.out.println("El nombre del profesor 1 de la materia es: "+materia1.getNombre_mat()+
                "es: "+nomMateria1Profesor1);

        String nomProfesor2Materia3 = materia3.getProfesor2().getNombre_prof();
        System.out.println("El nombre del profesor 2 de la materia es: "+materia3.getNombre_mat()+
                "es: "+nomProfesor2Materia3);
    }
    */

    //---------------------------

    public void imprimirMaterias(){
        //System.out.println("Materia 1:");
        materia1.imprimirDatosMat(1);
        materia1.imprimirProfe(1);
        //System.out.println("Materia 2:");
        materia2.imprimirDatosMat(2);
        materia2.imprimirProfe(2);
        //System.out.println("Materia 3:");
        materia3.imprimirDatosMat(3);
        materia3.imprimirProfe(3);
    }
}
