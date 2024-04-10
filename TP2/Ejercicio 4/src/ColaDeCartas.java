import java.util.Scanner;

public class ColaDeCartas {
    private int[] cartas;
    private int cantidad;

    public ColaDeCartas(int cantCartas){
        this.cantidad=cantCartas;
        this.cartas=new int[cantCartas];
    }

    public void setCartas(){
        Scanner userInput= new Scanner(System.in);
        for (int i = 0; i < this.cantidad; i++) {
            this.cartas[i]= userInput.nextInt();
        }
    }

    public void agregarCarta(int unaCarta){
        int[] colaDeCartas=new int[this.cantidad+1];
        for (int carta = 0; carta < this.cantidad+1; carta++) {
            if (carta< this.cantidad) {
                colaDeCartas[carta] = this.cartas[carta];
            }else {
                colaDeCartas[carta] = unaCarta;
            }
        }
        this.cantidad=this.cantidad+1;
        this.cartas=colaDeCartas;
    }

    public int getCarta(){
        int[] colaDeCartas=new int[this.cantidad-1];
        int devolucion;
        for (int carta = 0; carta < this.cantidad-1 ; carta++) {
            colaDeCartas[carta]=this.cartas[carta+1];
        }
        devolucion=this.cartas[0];
        this.cantidad=this.cantidad-1;
        this.cartas=colaDeCartas;
        return devolucion;
    }

    public int getLenght(){
        return (cantidad);
    }
}
