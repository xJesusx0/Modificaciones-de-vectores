
## imprimirVector

Este método imprime los elementos de un vector dado en la consola. Toma un arreglo de números decimales (`double[]`) como entrada y muestra cada elemento separado por un tabulador.

### Uso:

```java
public static void imprimirVector(double[] vector)
```

## agregar

Este método permite agregar un dato específico en un índice dado de un vector. Toma como entrada el índice, el dato y el vector, y devuelve el vector actualizado.

### Uso:

```java
agregar(int indice, double dato, double[] vector)
```

Ejemplo de uso:

```java
double[] miVector = {1.0, 2.0, 3.0};
miVector = agregar(1, 4.0, miVector); // Agrega el valor 4.0 en el índice 1
```

En este ejemplo, `miVector` se actualizará a `{1.0, 4.0, 3.0}`.
```

Este `readme.md` proporciona información básica sobre la funcionalidad y el uso de los métodos. Puedes ajustarlo según tus necesidades y agregar más detalles si es necesario.