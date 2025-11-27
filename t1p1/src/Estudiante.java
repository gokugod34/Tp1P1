import java.util.ArrayList;

public class Estudiante extends Persona implements MiembroUniversidad{

    private String carrera;
    private double promedio;
    private ArrayList<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera){
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = 0;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia m){
        materias.add(m);
    }

    public double calcularPromedioIterativo(){
        double suma = 0;
        for(Materia m : materias){
            suma += m.getCalificacion();
        }
        promedio = suma / materias.size();
        return promedio;
    }

    public static double calcularPromedioRecursivo(Materia[] materias, int i){
        if(i == materias.length-1){
            return materias[i].getCalificacion();
        }
        return materias[i].getCalificacion() + calcularPromedioRecursivo(materias, i+1);
    }

    @Override
    public String obtenerRol(){
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return super.toString() + " - Carrera: " + carrera + " - Promedio: " + promedio;
    }

    @Override
    public String toString(){
        return obtenerInformacionCompleta();
    }
}
