public class Socio{
    private Integer codigo;
    private String nombre;
   private Double cuotaMensual;
    private String actividad;

    public Socio(Integer codigo, String nombre, Double cuota, String actividad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cuotaMensual = cuota;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        return cuotaMensual;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    @Override
    public String toString() {
        return "Socio con código: " + codigo + "y nombre: " + nombre;
    }

    @Override
    public int hashCode() {
        int hashCode =11;
        hashCode= hashCode * codigo.hashCode();


        return hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null){return false; }

        if (!(object instanceof Socio)) {return false; }

        Socio otroSocio = (Socio) object;

        return codigo.equals(otroSocio.getCodigo());

    }
    public Integer getCodigo() {
        return codigo;
    }
}
