public class Usuario {

    private int rut;

    private String contraseña;

    public Usuario(int rut, String contraseña) {
        this.rut = rut;
        this.contraseña = contraseña;
    }

    public int getRut() {
        return rut;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
