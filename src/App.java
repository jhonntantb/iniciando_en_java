import javaprimerospasos.model.Persona;
import javaprimerospasos.services.IPersonaService;
import javaprimerospasos.services.PersonaServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona pers1 = new Persona(1, "pepe");
        IPersonaService personaService = new PersonaServiceImpl();

        personaService.register(pers1);
    }
}
