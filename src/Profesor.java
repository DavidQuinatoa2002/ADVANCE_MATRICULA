import java.util.Scanner;

public class Profesor {
    private String nombre_prof="";
    private String cedula_prof="";
    private int codigo_prof=0;

//-------------------------------------------
    public String getNombre_prof() {return nombre_prof;
    }
    public void setNombre_prof(String nombre_prof) {this.nombre_prof = nombre_prof;
    }
    public String getCedula_prof() {return cedula_prof;
    }
    public void setCedula_prof(String cedula_prof) {this.cedula_prof = cedula_prof;
    }
    public int getCodigo_prof() {return codigo_prof;
    }
    public void setCodigo_prof(int codigo_prof) {this.codigo_prof = codigo_prof;
    }


//----------------------------------------------------
    public Profesor(){

    }
    public Profesor(String nombre_prof, String cedula_prof, int codigo_prof) {
        this.nombre_prof = nombre_prof;
        this.cedula_prof = cedula_prof;
        this.codigo_prof = codigo_prof;
    }




 //------------------------------
    public void ingresarDatosProfe(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor: "+i);
        this.nombre_prof=sc.next();
        System.out.println("Ingrese la cedula del profesor: "+i);
        this.cedula_prof=sc.next();
        System.out.println("Ingrese el codigo del profesor: "+i);
        this.codigo_prof=sc.nextInt();

    }


    public void imprimirDatosProfesor(){
        System.out.println("Profesor: "+nombre_prof);
        System.out.println("Codigo: "+codigo_prof);
        System.out.println("Cedula: "+cedula_prof);

    }

}
