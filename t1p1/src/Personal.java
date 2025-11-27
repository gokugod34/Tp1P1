public class Personal extends Persona implements MiembroUniversidad {

    private String departamento;
    private String puesto;
    private String fechaIngreso;

    public Personal(String nombre, String apellido, int edad, String documento, String departamento, String puesto, String fecha){
        super(nombre, apellido, edad, documento);
        this.departamento = departamento;
        this.puesto = puesto;
        this.fechaIngreso = fecha;
    }

    @Override
    public String obtenerRol(){
        return "Personal Administrativo";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return super.toString() + " - " + puesto + " en " + departamento;
    }
}
