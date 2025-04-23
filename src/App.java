
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;


public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos",22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Helena", 26),
            
            
        };
            PersonaController pC = new PersonaController();
            ViewConsole vC = new ViewConsole();
            vC.printMessage("Arreglo de personas");
            vC.printPersonsArray(personas);
            vC.printMessage("\nArreglo de personas ordenado.");
            pC.ordenarPorEdad(personas);
            vC.printPersonsArray(personas);

            vC.printMessage("\nBuscar persona con edad 40");
            Persona personaBuscada = pC.buscarPorEdad(personas, 40);
            if(personaBuscada == null) {
                System.out.println("Persona no encontrada.");
            } else {
                System.out.println(personaBuscada);
            }

            vC.printMessage("\nBuscar persona con edad 99");
            Persona personaBuscada2 = pC.buscarPorEdad(personas, 99);
            if(personaBuscada2 == null) {
                System.out.println("Persona no encontrada.");
            } else {
                System.out.println(personaBuscada2);
            }

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
