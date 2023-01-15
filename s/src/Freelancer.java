public class Freelancer {
    private String nombre;
    private String apellido;
    private String descripcion;

    private Integer anios_exp;

    //Ahora se van a poder crear los freelancer para agregarlos a las categorias
    public Freelancer(String nombre, String apellido, String descripcion, Integer anios_exp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.anios_exp = anios_exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAnios_exp() {
        return anios_exp;
    }

    public void setAnios_exp(Integer anios_exp) {
        this.anios_exp = anios_exp;
    }
}
