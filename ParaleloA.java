import java.util.LinkedList;
import java.util.Queue;

public class ParaleloA {
    private Queue<Estudiante> listado;

    public ParaleloA() {
        listado = new LinkedList<Estudiante>();

    }

    public void agregar(Estudiante dato) {
        listado.add(dato);
    }

    public Estudiante desencolar() throws Exception{
        if(listado.isEmpty()) {
            throw new Exception("Cola sin elementos");
        } return listado.poll();
    }

    public String listarEstudiantes(){
        String resultado = "";
        for(Estudiante x:listado) {
            resultado += x.toString() + "\n";
        }
        return resultado.toString();
    }
}
