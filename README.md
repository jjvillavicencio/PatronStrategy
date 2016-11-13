# Patrón Strategy

* * *

**Por:** John J. Villavicencio S.

* * *
## 1. Resumen
Este patrón define un conjunto de algoritmos, encapsula cada uno de ellos y los hace intercambiables. Permite que el algoritmo pueda variar independientemente de los clientes que lo utilicen.

Esto quiere decir que nuestros objetos deben estar preparados para afrontar diversos contextos sin cambiar las interacciones de estos con el cliente.

## 2. Estructura
![estructura](http://codigolinea.com/wp-content/uploads/2015/03/strategy-uml.png)

## 3. Elementos
Las clases y objetos que participan en este modelo son:
- **Strategy:** Declara una interfaz común para todos los algoritmos compatibles. El Contexutiliza esta interfaz para llamar al algoritmo definido por un ConcreteStrategy
- **ConcreteStrategy:** Implementa el algoritmo utilizando la interfaz de Strategy
- **Context:** Está configurado con un objeto ConcreteStrategy. Mantiene una referencia a un objeto de Strategy. Puede definir una interfaz que le permite acceder a sus datos Strategy.


![](http://codigolinea.com/wp-content/uploads/2015/03/Strategy2.jpeg)
