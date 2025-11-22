# Proyecto de Componentes de Vehículos en Java

¡Hola! Este es mi primer proyecto en Java sobre componentes de vehículos. Aquí describo cómo funciona.

## Clases y Relaciones

El proyecto tiene varias clases que representan las partes de un vehículo. La clase principal es `vehiculo`, que es como el objeto principal que contiene todo lo demás.

- **`vehiculo`**: Es la clase principal. Tiene atributos como `marca`, `modelo`, `matricula` y `año`. Además, contiene todos los demás componentes.
- **`motor`**: Representa el motor del coche.
- **`transmision`**: Es el sistema de transmisión.
- **`chasis`**: Es el esqueleto del coche.
- **`neumatico`**: Representa las llantas.
- **`sistemaFrenos`**: Es el sistema de frenos.
- **`sistemaElectrico`**: Es el sistema eléctrico del coche.
- **`registroVehicular`**: Guarda la información legal del vehículo.
- **`mantenimiento`**: Contiene información sobre el mantenimiento del coche.
- **`sensor`**: Representa los sensores del coche.
- **`App`**: Es la clase que ejecuta todo el programa.

Básicamente, la clase `vehiculo` se relaciona con todas las demás, porque un vehículo está compuesto por todas esas partes.

## Salida por Consola

Aquí iría una captura de pantalla de la consola mostrando cómo se crean los objetos y se usan los métodos.

```
[Arthr@Excalibur MINGW64 ~/Documents/VS/java/project-java-componentes/project-java-componentes (main)
$  /usr/bin/env C:\\Program\ Files\\Java\\jdk-25\\bin\\java.exe --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp C:\\Users\\USUARIO\\Documents\\VS\\java\\project-java-componentes\\project-java-componentes\\bin App 
Hello, World!
=============================================
      DETALLES COMPLETOS DEL VEHÍCULO
=============================================
Vehiculo creado exitosamente!
Marca: Toyota
Modelo: Corolla
Año: 2022
Matricula Vehículo: ABC-123
---------------------------------------------

>> Detalles del Registro Vehicular:
  - Matrícula Registro: ABC-123xd
  - Propietario: Cristian Gato
  - Fecha de Registro: 2022-01-15
---------------------------------------------

>> Detalles del Motor:
  - Tipo: Gasolina
  - Cilindrada: 2.0L
  - Potencia: 169 HP
---------------------------------------------

>> Detalles de la Transmisión:
  - Tipo: Automatica
  - Marchas: 10
  - Tracción: Delantera
---------------------------------------------

>> Detalles del Chasis:
  - Tipo: Monocasco
  - Peso: 1300.0 kg
  - Ancho: 1.78 m
  - Largo: 4.63 m
  - Alto: 1.43 m
---------------------------------------------

>> Detalles de los Neumáticos:
  - Marca: Michelin
  - Tamaño: 16.0 pulgadas
  - Presión: 32.0 PSI
---------------------------------------------

>> Detalles del Sistema de Frenos:
  - Tipo: Discos Ventilados
  - Estado: Activo
  - ABS: Si
  - Discos: 4
---------------------------------------------

>> Detalles del Sistema Eléctrico:
  - Batería: 12V
  - Luces: Encendidas
  - Estado de Sensores: Activos
---------------------------------------------

>> Estado de los Sensores:
  - Velocidad: 60.0 km/h
  - Temperatura del motor: 90.5 °C
  - Presión de neumáticos: 32.5 PSI
  - Nivel de combustible: 15.2 %
  - Presión de neumáticos: 32.5 PSI
  - Nivel de combustible: 15.2 %
  - Presión de neumáticos: 32.5 PSI
  - Nivel de combustible: 15.2 %
---------------------------------------------

>> Estado del Último Mantenimiento:
  - Descripción: Cambio de aceite
  - Presión de neumáticos: 32.5 PSI
  - Nivel de combustible: 15.2 %
---------------------------------------------

>> Estado del Último Mantenimiento:
  - Descripción: Cambio de aceite
  - Fecha: 2023-11-10
  - Nivel de combustible: 15.2 %
---------------------------------------------

>> Estado del Último Mantenimiento:
  - Descripción: Cambio de aceite
---------------------------------------------

>> Estado del Último Mantenimiento:
  - Descripción: Cambio de aceite

>> Estado del Último Mantenimiento:
  - Descripción: Cambio de aceite
>> Estado del Último Mantenimiento:
  - Descripción: Cambio de aceite
  - Fecha: 2023-11-10
  - Descripción: Cambio de aceite
  - Fecha: 2023-11-10
  - Fecha: 2023-11-10
  - Costo: $75.5
  - Costo: $75.5
  - Realizado: Si
  - Realizado: Si
=============================================

]
```

¡Gracias por revisar mi proyecto!