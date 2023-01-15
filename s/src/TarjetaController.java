import java.util.List;

public class TarjetaController {


    public List<Freelancer> mostrarFreelancerByCat(String categoria){
        Tarjeta list_freelancers = new Tarjeta();
        return list_freelancers.categorias.get(categoria);
    }


}
