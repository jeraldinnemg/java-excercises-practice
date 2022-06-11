public class SocioHabilitado extends Socio {
    private Double costoPileta;
    private Boolean habilitado;

    public SocioHabilitado(Integer codigo, String nombre, Double cuota, String actividad, Double costoPileta, Boolean habilitado) {
        super(codigo, nombre, cuota, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }

        public Double calcularCostoMensual() {
            Double costoMensual = getCuotaMensual();

            if (habilitado) {
                costoMensual = costoMensual + costoPileta;
            }
            return costoMensual;
        }
    }


