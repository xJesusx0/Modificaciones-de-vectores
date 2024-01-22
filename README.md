
## imprimirVector

Este método imprime los elementos de un vector dado en la consola. Toma un arreglo de números decimales (`double[]`) como entrada y muestra cada elemento separado por un tabulador.

### Uso:

```java
imprimirVector(double[] vector)
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

## mostrarError

Este método imprime un mensaje de error en la consola. Toma como entrada el mensaje de error.

### Uso:

```java
mostrarError(String mensaje)
```

## Métodos de Entrada de Usuario

### input

Este método solicita al usuario una entrada de texto y devuelve la entrada como una cadena no vacía.

### Uso:

```java
String dato = input(String mensaje)
```

### inputInt

Este método solicita al usuario una entrada numérica entera y la devuelve como un valor entero.

### Uso:

```java
int numeroEntero = inputInt(String mensaje)
```

### inputDouble

Este método solicita al usuario una entrada numérica decimal y la devuelve como un valor de doble precisión.

### Uso:

```java
double numeroDecimal = inputDouble(String mensaje)
```

### inputByte

Este método solicita al usuario una entrada numérica de tipo byte y la devuelve como un valor de tipo byte.

### Uso:

```java
byte numeroByte = inputByte(String mensaje)
```

## menu

Este método imprime un menú simple en la consola.

### Uso:

```java
menu()
```

Ejemplo de uso:

```java
menu(); // Imprime el menú en la consola
```

