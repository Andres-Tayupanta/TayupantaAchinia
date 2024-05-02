import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Cola {
    private PriorityQueue<PersonaAndresTayupanta>colaPersonas;
    public Cola(){
        colaPersonas = new PriorityQueue<PersonaAndresTayupanta>();
    }

    public void encolar(String _cedula, String _nombre, int _edad, String _genero, String _region){
        colaPersonas.offer(new PersonaAndresTayupanta());
    }

    public boolean dobleCelu(String celu){
        for (PersonaAndresTayupanta a:colaPersonas){
            if(a.getCedula().equals(celu)){
                return true;
            }
        }
        return false;
    }

    public List<PersonaAndresTayupanta>listPersonas(){

        return colaPersonas.stream().collect(Collectors.toList());
    }


}
