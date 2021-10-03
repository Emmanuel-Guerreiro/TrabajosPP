import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import Miembros.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {

        Curso prueba = new Curso("Matematica");
        Estudiante emma = new Estudiante("Emma", 47262);
        emma.inscribir(prueba);

        boolean esta = Inscripcion.estaInscripto(1, prueba);
        System.out.println(esta);
    }
}
