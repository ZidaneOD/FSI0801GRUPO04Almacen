package pe.unjfsc.quiz.java11.entity;

public class CECliente {

    private String OrdenP;
    private String Orden;
    private String nombre;
    private double ImpPedido;
    //generar
    private double Impuesto;
    private double TotalProy;
    private double Retencion20;
    private double Retencion30;
    private double Retencion40;

    public CECliente(String OrdenP, String Orden, String nombre, double ImpPedido, double Impuesto, double TotalProy, double Retencion20, double Retencion30, double Retencion40) {
        this.OrdenP = OrdenP;
        this.Orden = Orden;
        this.nombre = nombre;
        this.ImpPedido = ImpPedido;
        this.Impuesto = Impuesto;
        this.TotalProy = TotalProy;
        this.Retencion20 = Retencion20;
        this.Retencion30 = Retencion30;
        this.Retencion40 = Retencion40;
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

    public double getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public double getTotalProy() {
        return TotalProy;
    }

    public void setTotalProy(double TotalProy) {
        this.TotalProy = TotalProy;
    }

    public double getRetencion20() {
        return Retencion20;
    }

    public void setRetencion20(double Retencion20) {
        this.Retencion20 = Retencion20;
    }

    public double getRetencion30() {
        return Retencion30;
    }

    public void setRetencion30(double Retencion30) {
        this.Retencion30 = Retencion30;
    }

    public double getRetencion40() {
        return Retencion40;
    }

    public void setRetencion40(double Retencion40) {
        this.Retencion40 = Retencion40;
    }

    @Override
    public String toString() {
        return "CECliente{" + "OrdenP=" + OrdenP + ", Orden=" + Orden + ", nombre=" + nombre + ", ImpPedido=" + ImpPedido + ", Impuesto=" + Impuesto + ", TotalProy=" + TotalProy + ", Retencion20=" + Retencion20 + ", Retencion30=" + Retencion30 + ", Retencion40=" + Retencion40 + '}';
    }

}
