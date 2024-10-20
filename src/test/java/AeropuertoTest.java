import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AeropuertoTest {
    Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto");
    //Ciudades
    Ciudad temuco = new Ciudad("Temuco", "Chile");
    Ciudad santiago = new Ciudad("Santiago", "Chile");
    Ciudad arica = new Ciudad("Arica", "Chile");
    Ciudad buenosAires = new Ciudad("Buenos Aires", "Argentina");
    //Pilotos Avion 1
    Piloto piloto1 = new Piloto("Juan", "Jimenez");
    Piloto copiloto1 = new Piloto("Maria", "Jimenez");
    List<Piloto> pilotos1 = new ArrayList<>();
    //Pilotos Avion 2
    Piloto piloto2 = new Piloto("Carlos", "Fernandez");
    Piloto copiloto2 = new Piloto("Luisa", "Martinez");
    List<Piloto> pilotos2 = new ArrayList<>();
    //Vuelos
    Vuelo vuelo1 = new Vuelo(1, 1210, 1210, temuco, santiago, pilotos1);
    Vuelo vuelo2 = new Vuelo(2, 1310, 1310, santiago, buenosAires, pilotos1);
    Vuelo vuelo3 = new Vuelo(3, 1210, 1210, arica, santiago, pilotos2);
    Vuelo vuelo4 = new Vuelo(4, 1310, 1310, santiago, temuco, pilotos2);
    List<Vuelo> vuelosAvion1 = new ArrayList<>();
    List<Vuelo> vuelosAvion2 = new ArrayList<>();
    //Aviones
    Avion avion1 = new Avion("1", vuelosAvion1);
    Avion avion2 = new Avion("2", vuelosAvion2);
    //Pasajeros y pasaporte
    Pasaporte pasaporte1 = new Pasaporte(1, "Chileno", 0, 1010);
    Pasajero pasajero1 = new Pasajero("Jose", "Manriquez", pasaporte1);
    Pasaporte pasaporte2 = new Pasaporte(2, "Argentino", 1, 1110);
    Pasajero pasajero2 = new Pasajero("David", "Baez", pasaporte2);
    Pasaporte pasaporte3 = new Pasaporte(3, "Peruano", 2, 1210);
    Pasajero pasajero3 = new Pasajero("Ana", "Gómez", pasaporte3);
    Pasaporte pasaporte4 = new Pasaporte(4, "Brasileño", 3, 1310);
    Pasajero pasajero4 = new Pasajero("Lucas", "Silva", pasaporte4);

    @BeforeEach
    void setUp() {
        //Se registran aviones
        aeropuerto.registrarAviones("1", vuelosAvion1);
        aeropuerto.registrarAviones("2", vuelosAvion2);

        //Se añaden pilotos
        pilotos1.add(piloto1);
        pilotos1.add(copiloto1);

        pilotos2.add(piloto2);
        pilotos2.add(copiloto2);

        //Se añaden vuelos
        vuelosAvion1.add(vuelo1);
        vuelosAvion1.add(vuelo2);

        vuelosAvion2.add(vuelo3);
        vuelosAvion2.add(vuelo4);

        //Pasajeros en aviones
        List<Pasajero> pasajerosVuelo1 = new ArrayList<>();
        pasajerosVuelo1.add(pasajero1);
        vuelo1.setPasajeros(pasajerosVuelo1);
        List<Pasajero> pasajerosVuelo2 = new ArrayList<>();
        pasajerosVuelo2.add(pasajero2);
        vuelo2.setPasajeros(pasajerosVuelo2);
        List<Pasajero> pasajerosVuelo3 = new ArrayList<>();
        pasajerosVuelo3.add(pasajero3);
        vuelo3.setPasajeros(pasajerosVuelo3);
        List<Pasajero> pasajerosVuelo4 = new ArrayList<>();
        pasajerosVuelo4.add(pasajero4);
        vuelo4.setPasajeros(pasajerosVuelo4);
    }

    @Test
    void crearVuelo() {

        assertTrue(aeropuerto.crearVuelo(5,buenosAires,temuco,1410,1410,pilotos1,avion1));

        assertFalse(aeropuerto.crearVuelo(1,arica,santiago,1210,1210,pilotos1,avion1));
    }

    @Test
    void registrarAviones() {
        List<Vuelo> vuelos = new ArrayList<>();
        assertTrue(aeropuerto.registrarAviones("3",vuelos));
        assertFalse(aeropuerto.registrarAviones("1",vuelos));

    }


    @Test
    void registrarPasajeros() {
        Pasaporte pasaporte = new Pasaporte(5, "Chileno", 4, 1410);
        Pasajero pasajero = new Pasajero("Luis", "Hernandez", pasaporte);
        assertTrue(aeropuerto.registrarPasajeros(avion1,1,pasajero));
        assertFalse(aeropuerto.registrarPasajeros(avion2,9,pasajero));

    }

    @Test
    void registrarPilotos() {
        Piloto nuevoPiloto = new Piloto("Juana","Vasquez");
        assertTrue(aeropuerto.registrarPilotos(avion1,1,nuevoPiloto));
        assertFalse(aeropuerto.registrarPilotos(avion2,9,nuevoPiloto));
    }

    @Test
    void validarPasajeros() {
        assertFalse(aeropuerto.validarPasajeros(avion1,1,1210));
        assertTrue(aeropuerto.validarPasajeros(avion1,2,1210));

    }

    @Test
    void buscarPasajeroPorFecha() {
        List<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(pasajero1);
        pasajeros.add(pasajero3);
        assertIterableEquals(pasajeros,aeropuerto.buscarPasajeroPorFecha(1210));
    }

    @Test
    void buscarPasajeroPorVuelo() {
        List<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(pasajero1);
        assertIterableEquals(pasajeros,aeropuerto.buscarPasajeroPorVuelo(avion1,1));
    }
}