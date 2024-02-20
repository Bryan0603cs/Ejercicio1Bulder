
import java.time.LocalDateTime;
import java.util.List;

// Ejemplo de uso del patrón Builder
public class EjemploReservaViaje {

    public static void main(String[] args) {

        // Crear una reserva de viaje con solo la fecha de salida y destino
        ReservasViajes reserva1 = ReservasViajes.builder()
                .fechaSalida(LocalDateTime.of(2024, 2, 10, 20, 12))
                .duracionViajeDias(7)
                .build();

        // Crear una reserva de viaje con detalles personalizados
        ReservasViajes reserva2 = ReservasViajes.builder()
                .fechaSalida(LocalDateTime.of(2031, 2, 19, 23, 58))
                .duracionViajeDias(20)
                .tipoAlojamiento("Hotel 2 estrellas")
                .preferenciaTransporte("bus")
                .actividadesPlaneadas(List.of("Patinar", "nadar","comer"))
                .dietasEspeciales("Alergico al mani")
                .build();

        // Realizar operaciones con las instancias de reserva de viaje creadas
        System.out.println("Reserva 1: " + reserva1.getFechaSalida());
        System.out.println("Reserva 2: " + reserva2.getFechaSalida() + ", Duración: " + reserva2.getDuracionViajeDias() + " días, Transporte: " + reserva2.getPreferenciaTransporte());
    }
}




