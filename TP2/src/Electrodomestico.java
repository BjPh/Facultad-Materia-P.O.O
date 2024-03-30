public class Electrodomestico {

    private String nombre,color;
    private int precioBase,consumeEner,peso;

    //CONSTRUCTORES

    public Electrodomestico(String unNombre){
        this.nombre=unNombre;
        this.color="Gris Plata";
        this.precioBase=100;
        this.consumeEner=10;
        this.peso=2;
    }

    public Electrodomestico(String unNombre, String unColor){
        this(unNombre);
        this.color=unColor;
    }

    public Electrodomestico(String unNombre, String unColor, int unPrecio){
        this(unNombre,unColor);
        this.precioBase=unPrecio;
    }

    public Electrodomestico(String unNombre, String unColor, int unPrecio, int consumo) {
        this(unNombre, unColor, unPrecio);
        this.consumeEner = consumo;
    }

    public Electrodomestico(String unNombre, String unColor, int unPrecio, int consumo, int unPeso) {
        this(unNombre, unColor, unPrecio, consumo);
        this.peso = unPeso;
    }

    // GETS AND SETS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getConsumeEner() {
        return consumeEner;
    }

    public void setConsumeEner(int consumeEner) {
        this.consumeEner = consumeEner;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //METODOS

    public void lowConsume(){
        if (this.consumeEner<45){
            System.out.println("El electrodomestico es de bajo consumo");
        }else{System.out.println("El electrodomestico no es de bajo consumo");}
    }

    public double balanceCalc(){
        return ((double) this.precioBase / this.peso);
    }

    public void productGamaAlta(){
        if (balanceCalc() >= 3){
            System.out.println("El producto es de gama alta");
        }else{
            System.out.println("este producto no es de gama alta");
        }
    }

    public void caracteristicas(){
        System.out.println("Electrodomestico: "+ this.nombre+
                            ", Color: "+ this.color+
                            ", Precio: "+ this.precioBase+"$"+
                            ", Consumo Energetico: "+ this.consumeEner+"Kw"+
                            ", Peso:"+ this.peso+"Kg");
    }

    public static void main(String[] args){
        Electrodomestico elect1= new Electrodomestico("Finking", "rojo", 10, 40, 5);
        Electrodomestico elect2= new Electrodomestico("Maklen");
        elect2.setPeso(300);
        elect2.setPrecioBase(2600);

        elect1.lowConsume();
        elect1.productGamaAlta();
        System.out.println("El balance es de "+elect1.balanceCalc());
        elect1.caracteristicas();

        elect2.lowConsume();
        elect2.productGamaAlta();
        System.out.println("El balance es de "+elect2.balanceCalc());
        elect2.caracteristicas();
    }
}
