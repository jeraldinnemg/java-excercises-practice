public class Main {
    public static void main(String[] args) {
        Socio unSocioComun = new Socio(001, "Jeraldinne", 4000.00, "gimnasio");
        System.out.println("El costo mensual de un socio común es " + unSocioComun.calcularCostoMensual());
        System.out.println("El valor del atributo cuotaMensual es: " + unSocioComun.calcularCostoMensual());
        System.out.println("El valor del atributo cuotaMensual es: " + unSocioComun.getCuotaMensual());

        SocioHabilitado unSocioHabilitado= new SocioHabilitado(002,"Reinaldo",2500.0,"Natacion", 1000.0, true);
        System.out.println("El costo mensual de un socio común es " + unSocioHabilitado.calcularCostoMensual());
        System.out.println("El valor del atributo cuotaMensual es: " + unSocioHabilitado.getCuotaMensual());
        // toString
        System.out.println(unSocioComun.toString());

        System.out.println("Son socios iguales? " + unSocioComun.equals(unSocioHabilitado));

        System.out.println("Son socios iguales? si comparo con null: " + unSocioComun.equals(null));
        System.out.println("Son socios iguales? si comparo contra otro objeto: " + unSocioComun.equals(new Perro()));
    }
}