import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private ArrayList<MiembroUniversidad> miembros;

    public Universidad(String nombre){
        this.nombre = nombre;
        miembros = new ArrayList<>();
    }

    public void agregarMiembro(MiembroUniversidad m){
        miembros.add(m);
    }

    public void listarMiembros(){
        for(MiembroUniversidad m : miembros){
            System.out.println(m.obtenerRol() + " -> " + m.obtenerInformacionCompleta());
        }
    }

    public static int contarEstudiantesRecursivo(Estudiante[] arr, String carrera, int i){
        if(i == arr.length){
            return 0;
        }
        if(arr[i].obtenerRol().equals("Estudiante") && arr[i].obtenerInformacionCompleta().contains(carrera)){
            return 1 + contarEstudiantesRecursivo(arr, carrera, i+1);
        }
        return contarEstudiantesRecursivo(arr, carrera, i+1);
    }

    public static Estudiante buscarEstudianteRecursivo(Estudiante[] arr, String doc, int i){
        if(i == arr.length){
            return null;
        }
        if(arr[i].getDocumento().equals(doc)){
            return arr[i];
        }
        return buscarEstudianteRecursivo(arr, doc, i+1);
    }
}
