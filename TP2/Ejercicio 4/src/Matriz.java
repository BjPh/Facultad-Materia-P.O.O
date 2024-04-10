import java.util.Scanner;

public class Matriz {
    private final int[] data;
    private final int fila, columnas;

    public Matriz(int cantFila,int cantColumnas){
        this.fila=cantFila;
        this.columnas=cantColumnas;
        this.data=new int[cantColumnas*cantFila];
    }

    public void setMatriz(){
        Scanner userInput = new Scanner(System.in);
        for (int fil = 0; fil < this.fila ; fil++) {
            for (int col = 0; col < this.columnas ; col++) {
                this.data[(fil*this.columnas)+col]=userInput.nextInt();
            }
        }
    }

    public void showMatriz(){
        for (int fil = 0; fil < this.fila ; fil++) {
            for (int col = 0; col < this.columnas ; col++) {
                System.out.println(this.data[(fil*this.columnas)+col]);
            }
        }
    }

    public int getDataMatriz(int unaFila,int unaColumna){
        if ((unaFila<=this.fila && unaFila>0)&&(unaColumna<=this.columnas && unaColumna>0)){
            return (data[(unaFila*unaColumna)-1]);
        }
        else{
            return -1;
        }
    }

}
