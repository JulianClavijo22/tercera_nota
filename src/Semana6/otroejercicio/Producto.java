package Semana6.otroejercicio;

public class Producto { 
    // Atributos
    String name;
    double price;

    // Constructor
    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Producto: " + name + " | Precio: $" + price);
    }

    // Clase principal para ejecutar el programa
    public static void main(String[] args) {
        // Crear un arreglo de productos
        Producto[] productos = {
            new Producto("Laptop", 12000),
            new Producto("Celular", 8500),
            new Producto("Tablet", 6000),
            new Producto("Monitor", 4500),
            new Producto("Teclado", 700)
        };

        // Recorrer el arreglo con un for-each
        for (Producto p : productos) {
            p.showInfo();
        }
    }



    
}
