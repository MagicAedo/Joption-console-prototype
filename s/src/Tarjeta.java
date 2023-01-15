import java.util.*;

public class Tarjeta {
    Map<String,List<Freelancer>> categorias = new HashMap<>();

    public Map<String, List<Freelancer>> getCategorias() {
        return categorias;
    }
    public Tarjeta() {
        //Se crean freelancers predeterminados para las categorias
        //Musica:
        Freelancer m1 = new Freelancer("Santiago","Quintero","Me gusta la música y lo que se puede hacer con ella, si quieres a un buen músico, yo estaré para ti",5);
        Freelancer m2 = new Freelancer("Julian","Ramirez","Me gusta la música y lo que se puede hacer con ella, si quieres a un buen músico, yo estaré para ti",12);
        Freelancer m3 = new Freelancer("Samanta","Agustina","Me gusta la música y lo que se puede hacer con ella, si quieres a un buen músico, yo estaré para ti",1);
        Freelancer m4 = new Freelancer("Felipe","Benitez","Me gusta la música y lo que se puede hacer con ella, si quieres a un buen músico, yo estaré para ti",8);
        Freelancer m5 = new Freelancer("Laura","FLorez","Me gusta la música y lo que se puede hacer con ella, si quieres a un buen músico, yo estaré para ti",4);
        Freelancer m6 = new Freelancer("Alejo","Gutierrez","Me gusta la música y lo que se puede hacer con ella, si quieres a un buen músico, yo estaré para ti",9);
        categorias.put("musica", Arrays.asList(m1,m2,m3,m4,m5,m6));
        //Modas:
        Freelancer md1 = new Freelancer("Sara","Valentina","La moda es mi pasión y me gustaría que tu pudieras darte cuenta de eso, estoy para tu servicio",2);
        Freelancer md2 = new Freelancer("Sofia","Quintero","La moda es mi pasión y me gustaría que tu pudieras darte cuenta de eso, estoy para tu servicio",3);
        Freelancer md3 = new Freelancer("Leonel","Alvarez","La moda es mi pasión y me gustaría que tu pudieras darte cuenta de eso, estoy para tu servicio",7);
        Freelancer md4 = new Freelancer("Felix","Serrano","La moda es mi pasión y me gustaría que tu pudieras darte cuenta de eso, estoy para tu servicio",1);
        Freelancer md5 = new Freelancer("Daniel","Perez","La moda es mi pasión y me gustaría que tu pudieras darte cuenta de eso, estoy para tu servicio",10);
        Freelancer md6 = new Freelancer("Luisa","Sangon","La moda es mi pasión y me gustaría que tu pudieras darte cuenta de eso, estoy para tu servicio",3);
        categorias.put("moda", Arrays.asList(md1,md2,md3,md4,md5,md6));
        //Tecnologia:
        Freelancer t1 = new Freelancer("Philip","Sanchez","Quiero poder ayudarte con tu problema, los computadores y el codigo son lo mío",2);
        Freelancer t2 = new Freelancer("Holguin","Farrero","Quiero poder ayudarte con tu problema, los computadores y el codigo son lo mío",10);
        Freelancer t3 = new Freelancer("Ramiro","Smith","Quiero poder ayudarte con tu problema, los computadores y el codigo son lo mío",15);
        Freelancer t4 = new Freelancer("Suavena","Iguana","Quiero poder ayudarte con tu problema, los computadores y el codigo son lo mío",16);
        Freelancer t5 = new Freelancer("Toro","Forero","Quiero poder ayudarte con tu problema, los computadores y el codigo son lo mío",19);
        Freelancer t6 = new Freelancer("Daniel","Guardia","Quiero poder ayudarte con tu problema, los computadores y el codigo son lo mío",3);
        categorias.put("tecnologia",Arrays.asList(t1,t2,t3,t4,t5,t6));
        //Diseño:
        Freelancer d1 = new Freelancer("Thiago","Messi","El diseño es lo mío, me gusta ver lo que puedo lograr con las ideas de las personas",1);
        Freelancer d2 = new Freelancer("Santiago","Zanguilo","El diseño es lo mío, me gusta ver lo que puedo lograr con las ideas de las personas",4);
        Freelancer d3 = new Freelancer("Pedro","Infante","El diseño es lo mío, me gusta ver lo que puedo lograr con las ideas de las personas",5);
        Freelancer d4 = new Freelancer("Daniela","Higuera","El diseño es lo mío, me gusta ver lo que puedo lograr con las ideas de las personas",6);
        Freelancer d5 = new Freelancer("Leonel","Gutierrez","El diseño es lo mío, me gusta ver lo que puedo lograr con las ideas de las personas",9);
        Freelancer d6 = new Freelancer("Ferney","Ortega","El diseño es lo mío, me gusta ver lo que puedo lograr con las ideas de las personas",11);
        categorias.put("disenio", Arrays.asList(d1,d2,d3,d4,d5,d6));
    }



}
