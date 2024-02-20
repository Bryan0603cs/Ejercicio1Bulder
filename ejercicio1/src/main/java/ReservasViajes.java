
import java.time.LocalDateTime;

import java.util.List;

public class ReservasViajes {
    private LocalDateTime fechaSalida;
    private int duracionViajeDias;
    private List<String> actividadesPlaneadas;
    private String dietasEspeciales;
    private String preferenciaTransporte;
    private String tipoAlojamiento;
    
    
    
    public ReservasViajes(LocalDateTime fechaSalida, int duracionViajeDias, String dietasEspeciales, String preferenciaTransporte, String tipoAlojamiento,List<String> actividadesPlaneadas) {
        
        this.dietasEspeciales = dietasEspeciales;
        this.fechaSalida = fechaSalida;
        this.duracionViajeDias = duracionViajeDias;
        this.preferenciaTransporte = preferenciaTransporte;
        this.tipoAlojamiento = tipoAlojamiento;
        this.actividadesPlaneadas = actividadesPlaneadas;
    }

    


    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }
    public void setActividades(List<String> actividadesPlaneadas) {
        this.actividadesPlaneadas = actividadesPlaneadas;
    }
    public List<String> getActividades() {
        return actividadesPlaneadas;
    }
    public int getDuracionViajeDias() {
        return duracionViajeDias;
    }

    public String getDietasEspeciales() {
        return dietasEspeciales;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setDuracionViajeDias(int duracionViajeDias) {
        this.duracionViajeDias = duracionViajeDias;
    }

    public void setDietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
    }

    public String getPreferenciaTransporte() {
        return preferenciaTransporte;
    }

    public void setPreferenciaTransporte(String preferenciaTransporte) {
        this.preferenciaTransporte = preferenciaTransporte;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

     public static ReservasViajesBuilder builder(){
        return new ReservasViajesBuilder();
    }

    public static class ReservasViajesBuilder{

        private LocalDateTime fechaSalida;
        private int duracionViajeDias;
        private String preferenciaTransporte;
        private List<String> actividadesPlaneadas;
        private String dietasEspeciales;
        private String tipoAlojamiento;

        private ReservasViajesBuilder(){}

        public ReservasViajesBuilder fechaSalida(LocalDateTime fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }

        public ReservasViajesBuilder duracionViajeDias(int duracionViajeDias) {
            this.duracionViajeDias = duracionViajeDias;
            return this;
        }

        public ReservasViajesBuilder tipoAlojamiento(String tipoAlojamiento) {
            this.tipoAlojamiento = tipoAlojamiento;
            return this;
        }

        public ReservasViajesBuilder preferenciaTransporte(String preferenciaTransporte) {
            this.preferenciaTransporte = preferenciaTransporte;
            return this;
        }

        public ReservasViajesBuilder actividadesPlaneadas(List<String> actividadesPlaneadas) {
            this.actividadesPlaneadas = actividadesPlaneadas;
            return this;
        }

        public ReservasViajesBuilder dietasEspeciales(String dietasEspeciales) {
            this.dietasEspeciales = dietasEspeciales;
            return this;
        }

        public ReservasViajes build(){
            return new ReservasViajes(fechaSalida,duracionViajeDias, dietasEspeciales, preferenciaTransporte,tipoAlojamiento , actividadesPlaneadas);
        }

    }
}
