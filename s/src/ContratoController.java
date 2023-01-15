import java.util.ArrayList;
import java.util.List;

public class ContratoController {
    List<Contrato> contratos = new ArrayList<>();

    public ContratoController(){}



    public void guardarContrato(Contrato c){
        contratos.add(c);
    }

    public void borrarContratos(Contrato c){
        contratos.remove(c);
        System.out.println("Se cancelo exitosamente el contrato del freelancer: " + c.getNombre_freelancer());
    }

    public List<Contrato> getContratos() {
        return contratos;
    }
}
