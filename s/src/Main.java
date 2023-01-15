import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean menuEnable = true;
        String opcionMenu;
        Scanner sc = new Scanner(System.in);
        ContratoController contratos = new ContratoController();
        DialogosConsola dc = new DialogosConsola();

        while (menuEnable) {
            dc.saludoInicial();
            opcionMenu = sc.next();

            if (opcionMenu.equals("1")) {
                dc.operacionContratos(contratos);
            }

            else if (opcionMenu.equals("2")) {
                contratos.guardarContrato(dc.operacionTarjeta());
            }

            else {
                System.out.println("Eligio una opción erronea");
            }
        }
    }}