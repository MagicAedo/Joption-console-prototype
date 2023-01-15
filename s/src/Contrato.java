import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Contrato {
    private String nombre_freelancer;
    private String descripcion_contrato;
    private Float valor_inicial;
    private String fecha_desde;
    private String fecha_hasta;
    private String tipo_pago;

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getNombre_freelancer() {
        return nombre_freelancer;
    }

    public void setNombre_freelancer(String nombre_freelancer) {
        this.nombre_freelancer = nombre_freelancer;
    }

    public String getDescripcion_contrato() {
        return descripcion_contrato;
    }

    public void setDescripcion_contrato(String descripcion_contrato) {
        this.descripcion_contrato = descripcion_contrato;
    }

    public Float getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(Float valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public Contrato(){
    }

    //Se crea el contrato y para hacerlo se le tendría que pasar un freelancer
    public void crearContrato(Freelancer freelancer){
        Scanner sc = new Scanner(System.in);
        String opcionMetodoPago;
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Nombre del trabajador: " + freelancer.getNombre() + " " + freelancer.getApellido());
        nombre_freelancer = freelancer.getNombre() + " " + freelancer.getApellido();
        System.out.println("Inserte una descripción corta de lo que quiere realizar: ");
        descripcion_contrato = sc.nextLine();
        System.out.println("Qué valor inicial va a tener el contrato (Podría cambiar): ");
        valor_inicial = sc.nextFloat();
        sc.nextLine();
        System.out.println("Inserte una fecha desde: ");
        fecha_desde = sc.nextLine();
        System.out.println("Inserte una fecha hasta: ");
        fecha_hasta = sc.nextLine();
        System.out.println("Seleccione un metodo de pago: ");
        System.out.println("1. Nequi     2. Efectivo    3. Tarjeta credito/debito");
        opcionMetodoPago = sc.next();

        if(opcionMetodoPago.equals("1")){
            tipo_pago="Nequi";
        }
        else if(opcionMetodoPago.equals("2")){
            tipo_pago="Efectivo";
        }
        else if(opcionMetodoPago.equals("3")) {
            tipo_pago="Tarjeta credito/debito";
        }
        System.out.println("Se ha creado exitosamente el contrato.");
    }



}
