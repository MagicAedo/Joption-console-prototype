import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class DialogosConsola {

    //Saludo inicial

    public void saludoInicial(){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a Joption");
        System.out.println("Porfavor elija alguna de las siguientes opciones:");
        System.out.println("1: Ver contratos creados              2: Ver categorias");
    }


    public Contrato operacionTarjeta(){
        TarjetaController tc = new TarjetaController();
        List<Freelancer> freelancers = new ArrayList<>();
        Contrato c = new Contrato();
        Scanner sc = new Scanner(System.in);

        System.out.println("Esta en la opción de Categorias");
        System.out.println("Las categorias disponibles son: ");
        System.out.println("1. Musica");
        System.out.println("2. Moda");
        System.out.println("3. Tecnologia");
        System.out.println("4. Disenio");
        String opcionCat = sc.next();
        if(opcionCat.equals("1")){
            freelancers = tc.mostrarFreelancerByCat("musica");
        }
        else if(opcionCat.equals("2")) {
            freelancers = tc.mostrarFreelancerByCat("moda");
        }
        else if(opcionCat.equals("3")){
            freelancers = tc.mostrarFreelancerByCat("tecnologia");
        }
        else if(opcionCat.equals("4")){
            freelancers = tc.mostrarFreelancerByCat("disenio");
        }

        for (Freelancer f: freelancers) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Nombre: "+f.getNombre());
            System.out.println("Apellido: "+f.getApellido());
            System.out.println("Descripcion: "+f.getDescripcion());
            System.out.println("Anios de experiencia: " + f.getAnios_exp());
            System.out.println("Para mostrar el siguiente freelancer oprima cualquier tecla        -       Crear contrato oprima 1");
            String opcionFreelancer = sc.next();
            if (opcionFreelancer.equals("1")) {
                Contrato newContrato = new Contrato();
                System.out.println("Creación de contrato");
                newContrato.crearContrato(f);
                c = newContrato;
                return c;

            }
        }


        return c;

    }


    public void operacionContratos(ContratoController contratos){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Esta en la opcion de ver contrato");
        if(contratos.getContratos().isEmpty()){
            System.out.println("No hay contratos realizados en el momento.");
        }
        else{
            for (Contrato c: contratos.contratos) {
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("Nombre Freelancer: " + c.getNombre_freelancer());
                System.out.println("Descripcion contrato: " + c.getDescripcion_contrato());
                System.out.println("Costo actual del contrato: " + c.getValor_inicial());
                System.out.println("Fecha desde: " + c.getFecha_desde());
                System.out.println("Fecha hasta: " + c.getFecha_hasta());
                System.out.println("Tipo de pago: " + c.getTipo_pago());
            }
        }
    }


}
