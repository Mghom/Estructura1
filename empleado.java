public class empleado {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Edad;
    private String Cargo;
    
    public empleado (String nombre, String apellido, String direccion, String edad, String cargo){
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Edad = edad;
        Cargo = cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

}
