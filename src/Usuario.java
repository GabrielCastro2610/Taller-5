public class Usuario {
    /**
     *  Rut
     */
    private String rut;
    /**
     *  Nombre
     */
    private String nombre;
    /**
     *  Apellido
     */
    private String apellido;
    /**
     *  Contraseña
     */
    private String contraseña;

    /**
     * Constructor de la clase objeto usuario
     * @param rut
     * @param nombre
     * @param apellido
     * @param contraseña
     */
    public Usuario(String rut, String nombre, String apellido, String contraseña) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String toString() { return rut + ", " + nombre + ", " + apellido + ", " + contraseña; }
}
