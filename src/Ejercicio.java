public class Ejercicio {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Portátil", 1200.0, 10);
        Producto producto2 = new Producto("Auriculares", 150.0, 5);

        producto1.mostrarProducto();
        producto2.mostrarProducto();

        producto1.vender(3);
        producto2.vender(6);

        producto2.reponer(10);

        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }
}

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
            System.out.println(cantidadVendida + " unidades de " + nombre + " vendidas.");
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidadVendida + " unidades de " + nombre + ".");
        }
    }

    public void reponer(int cantidadReponer) {
        cantidad += cantidadReponer;
        System.out.println(cantidadReponer + " unidades de " + nombre + " repuestas.");
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad);
    }
}
