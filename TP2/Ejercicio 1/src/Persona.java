import java.time.LocalDate;

public class Persona {
    private long dni;
    private String  sexo, nombre, apellido;
    private LocalDate fNacimiento;
    private double peso, altura;

    public Persona(long unDni) {
        this.dni= unDni;
        this.fNacimiento = LocalDate.of(2000,1,1);
        this.sexo = "femenino";
        this.nombre = "N";
        this.apellido = "N";
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(long unDni, String unNombre, String unApellido){
        this(unDni);
        this.nombre = unNombre;
        this.apellido = unApellido;
    }

    public Persona(long unDni, LocalDate unaFecha, String unNombre, String unApellido){
        this(unDni, unNombre, unApellido);
        this.fNacimiento = unaFecha;
    }

    public Persona(long unDni, LocalDate unaFecha, String unNombre, String unApellido, String unSexo){
        this(unDni, unaFecha, unNombre, unApellido);
        this.sexo = unSexo;
    }

    public Persona(long unDni, LocalDate unaFecha, String unNombre, String unApellido, String unSexo, double unPeso){
        this(unDni, unaFecha, unNombre, unApellido, unSexo);
        this.peso = unPeso;
    }

    public Persona(long unDni, LocalDate unaFecha, String unNombre, String unApellido, String unSexo, double unPeso, double unaAltura){
        this(unDni, unaFecha, unNombre, unApellido, unSexo, unPeso);
        this.altura = unaAltura;
    }

    public long getDni() {return dni;}

    public double getPeso() {return peso;}

    public double getAltura() {return altura;}

    public String getSexo() {return sexo;}

    public String getNombre() {return nombre;}

    public String getApellido() {return apellido;}

    public LocalDate getfNacimiento() {return fNacimiento;}

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC(){return (this.peso/(this.altura*this.altura));}

    public void inShape(){
        if (18.5 < getIMC() && getIMC() < 25){
            System.out.println("Esta en forma");
        }
        else {
            System.out.println("No esta en forma");
        }
    }

    public void checkBirthday(){
        if (this.fNacimiento.equals(getFActual())){
            System.out.println("Feliz Cumpleaños");
        }
    }

    public LocalDate getFActual(){
        return LocalDate.now();
    }

    public int getEdad(){
        int i = 0;
        LocalDate fecha = getfNacimiento();
        while (fecha.isBefore(getFActual()) || fecha.isEqual(getFActual())) {
            i = i+1;
            fecha = fecha.plusYears(1);
        }
        return i;
    }

    public void mayorEdad(){
        if (getEdad()>= 18){
            System.out.println("Es mayor de edad");
        }else {
           System.out.println("No es mayor de edad");
        }
    }


    public void validVotante(){
        if(getEdad()>=16){
            System.out.println("Puede Votar");
        }else {System.out.println("No Puede Votar");}
    }

    public String datosCompletos(){
        return ("Dni: "+getDni()+
                ", Fecha de Nacimiento: "+ getfNacimiento().toString()+
                ", Sexo: "+ getSexo()+
                ", Nombre: "+ getNombre()+
                ", Apellido: "+ getApellido()+
                ", Altura: "+ getAltura()+
                ",Peso: "+ getPeso());
    }

    public static void main(String[] args){
        Persona per1 = new Persona(43179598, LocalDate.of(2001,02,17), "Brian", "Perez","Masculino", 61.4, 1.74);
        System.out.println(per1.datosCompletos());
        per1.validVotante();
        per1.checkBirthday();
        per1.mayorEdad();
        System.out.println(per1.getIMC());
        per1.inShape();
    }
}
