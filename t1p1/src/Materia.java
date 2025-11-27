public class Materia {

    private String nombre;
    private String codigo;
    private double calificacion;
    private Profesor profesor;

    public Materia(String nombre, String codigo, double calificacion, Profesor profesor){
        this.nombre = nombre;
        this.codigo = codigo;
        this.calificacion = calificacion;
        this.profesor = profesor;
    }

    public String getNombre(){ return nombre; }
    public double getCalificacion(){ return calificacion; }
    public Profesor getProfesor(){ return profesor; }

    @Override
    public String toString(){
        return nombre + " (" + codigo + ") - Profesor: " + profesor.getNombre();
    }
}
