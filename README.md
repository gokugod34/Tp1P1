# Tp1P1

Enfoque Recursivo
La recursión es cuando una función se llama a sí misma, reduciendo el problema paso a paso hasta alcanzar un caso base.

Ventajas:

Código más limpio, simple y fácil de leer.
Es más natural para problemas definidos recursivamente (árboles, factorial, Fibonacci, recorrido de estructuras jerárquicas).
Permite expresar soluciones complejas con menos líneas de código.

Desventajas:

Puede causar stack overflow si hay demasiadas llamadas recursivas.
El rendimiento puede ser peor debido al coste de crear muchos frames de ejecución.
Requiere siempre tener un caso base bien definido, si no → bucle infinito recursivo.

Enfoque Iterativo
El iterativo utiliza ciclos for, while, contadores, sin llamar a la misma función.

Ventajas:
Usa menos memoria — no crea múltiples llamadas en la pila (stack).
Suele ser más eficiente y rápido en ejecución.
Evita el riesgo de desbordamiento de pila.

Desventajas:
En algunos casos el código es más largo, menos intuitivo.
Algunas soluciones que son conceptualmente recursivas, se fuerzan a un formato iterativo artificial.

Explicacion de Herencia y Polimorfismo

La herencia permite crear jerarquías de clases, donde una clase hija reutiliza atributos y métodos de la clase padre.

Herencia

En mi proyecto usé herencia creando una clase general llamada Persona que tiene los datos que todas las personas de la universidad deberían tener, como:
nombre
apellido
edad
documento
Después hice que Estudiante, Profesor y Personal hereden de Persona. Esto significa que estas clases ya tienen automáticamente esos atributos sin tener que volver a escribirlos.

Esto es útil porque:
ahorro código
es más sencillo mantenerlo
si después quiero agregar un dato a todas las personas, como nacionalidad, solo lo agrego en Persona
representa bien la realidad porque un estudiante es una persona, un profesor es una persona.

Polimorfismo

También apliqué polimorfismo porque hice una interfaz MiembroUniversidad con estos métodos:
obtenerRol()
obtenerInformacionCompleta()
Las clases Estudiante, Profesor y Personal implementan esa interfaz, pero cada una devuelve diferente información.
Por ejemplo, cuando llamo al método obtenerInformacionCompleta():
si es Estudiante → muestra su carrera y su promedio
si es Profesor → muestra su especialidad
si es Personal → muestra su puesto de trabajo
Entonces, aunque yo los guardo en una misma lista de tipo MiembroUniversidad, cada uno se comporta distinto según su tipo real.

MiembroUniversidad m1 = new Estudiante(...);
MiembroUniversidad m2 = new Profesor(...);

m1.obtenerInformacionCompleta();
m2.obtenerInformacionCompleta();
