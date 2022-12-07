
package mundo;

public class Usuario {
    private int cedula;
    private int pasaporte;
    private int tarjetaC;
    private String nombre;
    private String apellido;
    private boolean presente;
    
    public Usuario () {
    cedula = 0;
    pasaporte = 0;
    tarjetaC = 0;
    nombre = "";
    presente= true;
    
    }
    
    public int getCedula () {
    return cedula;
    }
    
    public int getPasaporte () {
    return pasaporte;
    }
    
    public int getTarjetaC () {
    return tarjetaC;
    }
    
    public String getNombre() {
    return nombre;
    }
    public String getApellido(){
    return apellido;
    }
    public boolean getPresente(){
    return presente;
    }
    public void setCedula (int c) {
    cedula = c;
    }
    
    public void setPasaporte (int p) {
    pasaporte = p;
    }
    
    public void setTarjetaC (int t) {
    tarjetaC = t;
    }
    
    public void setNombre (String n){
    nombre = n;
    }
    public void setApellido (String a){
    apellido = a;
    }
    public void setPresente(boolean p){
    presente = p;
    }
    
}

