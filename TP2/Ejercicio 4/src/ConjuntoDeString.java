import java.util.Scanner;
import java.util.Random;

public class ConjuntoDeString {
    private String[] conjuntoString;
    private int cantidad ;

    public ConjuntoDeString(int cantString){
        this.cantidad=cantString;
        this.conjuntoString =new String[cantString];
    }

    public void setConjuntoString(){
        Scanner userInput=new Scanner(System.in);
        String unString;
        for (int i = 0; i < this.cantidad; i++) {
            unString=userInput.nextLine();
            while (existencia(unString)){
                System.out.println("Esto ya existe agrega otro :)");
                unString=userInput.nextLine();
            }
            this.conjuntoString[i]=unString;
        }
    }

    public String getConjuntoString(){
        Random random=new Random();
        int unvalor=random.nextInt(this.cantidad);
        return this.conjuntoString[unvalor];
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void deleteString(String unString){
        if (existencia(unString)) {
            for (int i = 0; i < this.cantidad; i++) {
                if (this.conjuntoString[i].equals(unString)) {
                    deleteString(i);
                }
            }
        }else {System.out.println("el string no existe en el conjunto");}
    }

    public void deleteString(int position){
        String[] nuevoConjunto=new String[this.cantidad-1];
        int nuevacantidad = 0;
        for (int i = 0; i < this.cantidad; i++) {
            if (i!=position){
                nuevoConjunto[nuevacantidad]=this.conjuntoString[i];
                nuevacantidad++;
            }
        }
        this.cantidad=nuevacantidad;
        this.conjuntoString=nuevoConjunto;
    }

    public boolean existencia(String unString){
        for (int i = 0; i < this.cantidad; i++) {
            if (unString.equals(conjuntoString[i])){
                return true;
            }
        }
        return false;
    }


}
