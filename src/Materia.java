import java.util.Scanner;

public class Materia {
    private String nombre_mat="";
    private int codigo=0;
    private int numero_horas=0;
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;



    //------------------------


    public String getNombre_mat() {return nombre_mat;
    }
    public void setNombre_mat(String nombre_mat) {this.nombre_mat = nombre_mat;
    }
    public int getCodigo() {return codigo;
    }
    public void setCodigo(int codigo) {this.codigo = codigo;
    }
    public int getNumero_horas() {return numero_horas;
    }
    public void setNumero_horas(int numero_horas) {this.numero_horas = numero_horas;
    }

    public Profesor getProfesor1() {return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {this.profesor3 = profesor3;
    }
    //-----------------------


    public Materia(){

    }
    public Materia(String nombre_mat, int codigo, int numero_horas, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        this.nombre_mat = nombre_mat;
        this.codigo = codigo;
        this.numero_horas = numero_horas;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }



    public void ingresarDatos(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia " +i+":");
        this.nombre_mat=sc.next();
        System.out.println("Ingrese el codigo de la materia " +i+":");
        this.codigo=sc.nextInt();
        System.out.println("Ingrese el numero de horas de la materia " +i+":");
        this.numero_horas=sc.nextInt();
    }

    public void ingresarProfesor(int i){
        if(i==1){
            profesor1 = new Profesor();
            profesor1.ingresarDatosProfe(i);
        }else if(i==2){
            profesor2 = new Profesor();
            profesor2.ingresarDatosProfe(i);
        }else{
            profesor3 = new Profesor();
            profesor3.ingresarDatosProfe(i);
            }
    }

    public void imprimirDatosMat(int i){
        System.out.println("*************************");
        System.out.println("Materia "+i+": "+nombre_mat);
        System.out.println("Codigo "+i+": "+codigo);
        System.out.println("Numero de horas semanales "+i+":"+numero_horas);
    }


    public void imprimirProfe(int i){
        if(i==1){
            profesor1.imprimirDatosProfesor();
        }else if(i==2){
            profesor2.imprimirDatosProfesor();
        }else{
            profesor3.imprimirDatosProfesor();
        }
    }



}
