package Views;
import Models.Persona;

public class ViewConsole {

    public void printPersonsArray(Persona[] personas) {
        int tam = personas.length;
        for (int i = 0; i < tam; i++) {
            System.out.println(personas[i]);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
    
}
