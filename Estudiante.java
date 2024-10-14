public class Estudiante {
    private int codigo;
    private String nombre;
    private int creditosAprobados;
    private int creditosActuales;
    private boolean creditosPagados;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }

    public int getCreditosActuales() {
        return creditosActuales;
    }

    public void setCreditosActuales(int creditosActuales) {
        this.creditosActuales = creditosActuales;
    }

    public boolean getCreditosPagados() {
        return creditosPagados;
    }

    public void setCreditosPagados(boolean creditosPagados) {
        this.creditosPagados = creditosPagados;
    }

    public Estudiante(int codigo, String nombre, int creditosAprobados, int creditosActuales, boolean creditosPagados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditosAprobados = creditosAprobados;
        this.creditosActuales = creditosActuales;
        this.creditosPagados = creditosPagados;
    }

    @Override
    public String toString() {

        String texto = "Estudiante: \n" +
                "Nombre: " + nombre +
                " | Creditos aprobados: " + creditosAprobados;
        String resultado = creditosPagados? texto + "Sin valores pendientes de pago":
            texto + " | Debe pagar " + (55*creditosActuales);
        return  resultado;
    }
}
