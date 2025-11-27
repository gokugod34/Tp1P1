public class App {

    public static void ordenarEstudiantesPorApellido(Estudiante[] est) {
        if (est == null) return;
        int n = est.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                String apellidoJ = est[j] == null || est[j].getApellido() == null ? "" : est[j].getApellido();
                String apellidoMin = est[min] == null || est[min].getApellido() == null ? "" : est[min].getApellido();

                if (apellidoJ.compareToIgnoreCase(apellidoMin) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Estudiante temp = est[i];
                est[i] = est[min];
                est[min] = temp;
            }
        }
    }

    public static int busquedaBinariaEstudiantes(Estudiante[] arreglo, String apellido) {
        if (arreglo == null || apellido == null) return -1;
        apellido = apellido.toLowerCase();
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            String actual = arreglo[medio] == null || arreglo[medio].getApellido() == null
                    ? ""
                    : arreglo[medio].getApellido().toLowerCase();

            int cmp = actual.compareTo(apellido);

            if (cmp == 0) {
                return medio;
            } else if (cmp < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "Gomez", 20, "40100200", "Ingeniería");
        Estudiante e2 = new Estudiante("Ana", "Lopez", 22, "40100600", "Ingeniería");
        Estudiante e3 = new Estudiante("Mario", "Perez", 18, "40100900", "Sistemas");
        Estudiante e4 = new Estudiante("Luis", "Rodriguez", 19, "40101000", "Sistemas");

        Estudiante[] arr = new Estudiante[] { e1, e2, e3, e4 };

        ordenarEstudiantesPorApellido(arr);

        System.out.println("Array ordenado por apellido:");
        for (Estudiante e : arr) {
            System.out.println(e.getApellido() + ", " + e.getNombre());
        }

        String buscar = "Perez";
        int pos = busquedaBinariaEstudiantes(arr, buscar);
        if (pos >= 0) {
            System.out.println("Encontrado " + buscar + " en posición: " + pos + " -> " + arr[pos].getNombre() + " " + arr[pos].getApellido());
        } else {
            System.out.println(buscar + " no encontrado");
        }
    }
}
