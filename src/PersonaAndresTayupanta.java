public class PersonaAndresTayupanta implements Comparable<PersonaAndresTayupanta> {
   private String cedula;
    private String nombre;
    private  int edad;
    private String genero;

    private  String region;

    public PersonaAndresTayupanta() {
        this.cedula = "1728084912";
        this.nombre = "Andres";
        this.edad = 20;
        this.genero = "hombre";
        this.region = "sierra";
    }

    public PersonaAndresTayupanta(String cedula, String nombre, int edad, String genero, String region) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.region = region;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
@Override
public String toString(){
        return "******DATOS*****\n"+
                "CEDULA: "+cedula+"\nNOMBRE: "+nombre
                +"\nEDAD: "+edad +"\nGENERO: "+genero
                +"\nREGION: "+genero;
    }


    @Override
    public int compareTo(PersonaAndresTayupanta o) {
        if (edad>edad){
            return 1;
        }else{
            if(edad<edad){
                return -1;
            }
        }
        return 0;
    }
}
