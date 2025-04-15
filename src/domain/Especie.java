package domain;

public class Especie {
    private String nombre;
    private double porcentajePesoCarnivoro;

    private TipoAlimentacion tipoAlimentacion;

    public Especie(String nombre, TipoAlimentacion tipoAlimentacion, double porcentajePesoCarnivoro) {
        this.nombre = nombre;
        if(tipoAlimentacion.esCarnivoro()){
            this.porcentajePesoCarnivoro = porcentajePesoCarnivoro;
        }
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Especie(String nombreEspecie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public double getPorcentajePesoCarnivoro() {
        return porcentajePesoCarnivoro;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
