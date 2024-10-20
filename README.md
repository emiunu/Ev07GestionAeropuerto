# Evidencia 07: Gestión de Caso Aeropuerto

## Descripción
El proyecto tiene como objetivo digitalizar la gestión de los procesos aeroportuarios, comenzando con la automatización de la recepción de pasajeros, con el fin de evitar aglomeraciones. Para ello, se desarrollará un sistema capaz de gestionar los vuelos y pasajeros de un aeropuerto de manera eficiente.

## Requisitos
El sistema deberá cubrir los siguientes puntos:

- **Gestión de Aeropuertos y Vuelos**:
    - Cada aeropuerto es capaz de gestionar varios aviones.
    - Cada avión está constituido por varios vuelos.
    - Cada vuelo está asociado a una ciudad de origen y destino.
    - Los vuelos deben almacenar la fecha, ciudad de origen y ciudad de destino.

- **Gestión de Personas**:
    - Los vuelos están compuestos por pasajeros y pilotos.
    - Los pasajeros no tienen acceso a la información de otros pasajeros para resguardar su privacidad.
    - Los pilotos sí tienen acceso a la información del vuelo al que están asignados.
    - Cada pasajero debe portar un pasaporte que incluye:
        - ID
        - Nacionalidad
        - Cantidad de hojas disponibles
        - Fecha de expiración del pasaporte

## Funcionalidades

1. **Creación de Vuelos y Registro de Aviones**:
    - Permite crear vuelos y registrar aviones asociados a dichos vuelos.

2. **Registro de Pasajeros y Pilotos en un Vuelo**:
    - Se puede registrar pasajeros y pilotos asignados a un vuelo específico.

3. **Validación de Pasaportes**:
    - Verifica que el pasaporte de cada pasajero no esté expirado y que tenga hojas disponibles.

4. **Búsqueda de Usuarios por Fecha de Vuelo**:
    - Permite buscar a todos los usuarios que tienen un vuelo en una fecha específica.

5. **Búsqueda de Usuarios por Vuelo**:
    - Permite buscar a todos los usuarios de un mismo vuelo para realizar seguimiento o gestión adicional.



- Realice un bosquejo de su solución en un diagrama de clases mediante la herramienta Visual Paradigm, para luego generar código automáticamente y gestionar el desarrollo en IntelliJ.