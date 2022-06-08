package pe.unjfsc.quiz.java11.entity;

public class CECliente {

    private String OrdenP;
    private String Orden;
    private String nombre;
    private double ImpPedido;

    public CECliente(String OrdenP, String Orden, String nombre, double ImpPedido) {
        this.OrdenP = OrdenP;
        this.Orden = Orden;
        this.nombre = nombre;
        this.ImpPedido = ImpPedido;
    }

    public CECliente() {
    }

    public String getOrdenP() {
        return OrdenP;
    }

    public void setOrdenP(String OrdenP) {
        this.OrdenP = OrdenP;
    }

    public String getOrden() {
        return Orden;
    }

    public void setOrden(String Orden) {
        this.Orden = Orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImpPedido() {
        return ImpPedido;
    }

    public void setImpPedido(double ImpPedido) {
        this.ImpPedido = ImpPedido;
    }

}
