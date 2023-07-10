/**
 * Esta clase representa un usuario del sistema.
 */
public class Usuario {
    /**
     * Rut del usuario.
     */
    private String rut;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Apellido del usuario.
     */
    private String apellido;

    /**
     * Contraseña del usuario.
     */
    private String contraseña;

    /**
     * Constructor de la clase Usuario.
     *
     * @param rut El rut del usuario.
     * @param nombre El nombre del usuario.
     * @param apellido El apellido del usuario.
     * @param contraseña La contraseña del usuario.
     */
    public Usuario(String rut, String nombre, String apellido, String contraseña) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el rut del usuario.
     *
     * @return El rut del usuario.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return El apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Usuario.
     *
     * @return La representación en forma de cadena del objeto Usuario.
     */
    public String toString() {
        return rut + ", " + nombre + ", " + apellido + ", " + contraseña;
    }
}
