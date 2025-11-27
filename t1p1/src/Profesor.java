import java.util.ArrayList;

public class Profesor extends Persona implements MiembroUniversidad {

    private String especialidad;
    private int aniosExperiencia;
    private ArrayList<Materia> materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int anios){
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.aniosExperiencia = anios;
        this.materiasAsignadas = new ArrayList<>();
    }

    public void asignarMateria(Materia materia){
        materiasAsignadas.add(materia);
    }

    @Override
    public String obtenerRol(){
        return "Profesor";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return super.toString() + " - Profesor de " + especialidad;
    }
}
