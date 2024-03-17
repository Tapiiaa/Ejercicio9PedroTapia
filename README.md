Entrega 9 Técnicas de Programación: 
Realizado por Pedro Tapia 

Link a mi repositorio: https://github.com/Tapiiaa/Ejercicio9PedroTapia.git
Ejercicio 1

Enunciado: 
El objetivo es crear un programa que permita a una cafetería gestionar las reservas de sus mesas y mostrar los diferentes tipos de mesas disponibles junto con sus precios.

La cafetería ofrece mesas individuales, dobles y de grupo. Para todas es necesario conocer su número, ubicación (interior, terraza) y fecha de última reserva. Las mesas de grupo están equipadas con enchufes para dispositivos electrónicos. Algunas tienen más enchufes que otras. Las mesas individuales y dobles tienen ciertas preferencias en términos de vista (jardín, calle). Debido a su ubicación, algunas mesas requieren una reserva mínima.

Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de última reserva.

a. Las clases y sus atributos Definir las clases necesarias para representar los distintos tipos de mesas ofrecidas para reserva. Indicar los diferentes atributos de estos últimos y el posible carácter abstracto de determinadas clases.

b. Los métodos Es necesario conocer el precio de reserva de todos los tipos de mesas.

Tipo de Mesa	Precio de Reserva
Individual	2,50 €/hora
Doble	4,50 €/hora
Grupo	7,90 €/hora
Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello. También agregue un constructor y un método que será útil para mostrar estas mesas en cada uno de ellos.

c. Las normas Todas las mesas que se ofrecen en reserva se almacenan en una tabla.

A continuación, se mostrará una vista previa de la pantalla que se genera cuando se navega por la tabla que contiene las mesas:

Estas son las mesas que ofrecemos para reservar:

Mesa individual nº5 (interior) vista jardín 2,50€/hora
Mesa doble nº10 (terraza) vista calle 4,50€/hora
Mesa de grupo nº20 (interior) 6 enchufes 7,90€/hora
El proyecto consiste en un sistema de reservas de mesas para un restaurante, implementado en Java. Cada clase representa un tipo diferente de mesa (Individual, Doble, Grupo) y hereda de la clase abstracta Mesa. Además, hay una clase Reserva que gestiona las reservas.

Explicación: 

Mesa.java: Es una clase abstracta que define la estructura básica de una mesa, incluyendo número, capacidad y precio. Contiene métodos para obtener estos valores y un método abstracto enseñar(), que se implementa en las subclases.

Individual.java: Representa una mesa individual con un precio establecido. Implementa el método enseñar(), mostrando detalles de la mesa.

Doble.java: Representa una mesa doble. Al igual que Individual, define un precio y sobrescribe el método enseñar() para mostrar sus detalles.

Grupo.java: Esta clase representa una mesa para grupos, con un precio predefinido y una implementación propia del método enseñar().

Reserva.java: Gestiona las reservas de mesas. Contiene un método principal que interactúa con el usuario, solicitando el número de personas, recomendando un tipo de mesa y mostrando los precios. Permite realizar múltiples reservas en una sesión y muestra las opciones de mesas disponibles.
