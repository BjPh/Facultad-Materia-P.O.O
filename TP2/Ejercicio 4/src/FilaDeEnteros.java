import java.util.Scanner;

public class FilaDeEnteros {
    private int[] fila;
    private int cantidad;

    public FilaDeEnteros(int cantEnteros){
        this.fila=new int[cantEnteros];
        this.cantidad=cantEnteros;
    }

    public void setFila(){
        Scanner userInput= new Scanner(System.in);
        for (int i = 0; i < cantidad; i++) {
            this.fila[i]= userInput.nextInt();
        }
    }

    public void agregarInt(){
        Scanner userInput= new Scanner(System.in);
        int[] nuevaFilaEnt= new int[this.cantidad+1];
        nuevaFilaEnt[0]=userInput.nextInt();
        for (int i = 0; i < cantidad; i++) {
            nuevaFilaEnt[i+1]=fila[i];
        }

        this.fila=nuevaFilaEnt;
        this.cantidad=this.cantidad+1;
    }

    public int getFilaInt(){
        int[] nuevaFilaEnt= new int[this.cantidad-1];
        int devolucion;
        for (int i = 1; i < cantidad; i++) {
            nuevaFilaEnt[i-1]=fila[i];
        }
        
        devolucion=this.fila[0];

        this.fila=nuevaFilaEnt;
        this.cantidad=this.cantidad-1;

        return devolucion;
    } 
    
    public int getLenght(){
        return this.cantidad;
    }
}
