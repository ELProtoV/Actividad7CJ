# Actividad7CJ

## Reporte de Implementación de Algoritmos en Java

### Introducción

Este reporte describe la implementación en Java de dos algoritmos: uno para calcular números primos y otro para calcular la sucesión de Fibonacci. El programa solicita al usuario un número entero positivo como límite para ambos algoritmos.

### Funcionamiento del programa

1. **Solicitud de límite:**
   - El programa solicita al usuario un número entero positivo como límite.
  
2. **Cálculo de cantidad:**
   - Se calcula el número de números primos y de la sucesión de Fibonacci que se mostrarán, usando el límite como tope.
  
3. **Creación de arreglos:**
   - Se crean dos arreglos, uno para almacenar los números primos y otro para los números de la sucesión de Fibonacci.
  
4. **Recorrido de números:**
   - Se recorren todos los números desde 2 hasta el límite.
  
5. **Verificación de primos:**
   - Para cada número, se verifica si es divisible por cualquier número menor que él. Si no lo es, se considera un número primo y se agrega al arreglo correspondiente.
  
6. **Cálculo de Fibonacci:**
   - Se calculan los números de la sucesión de Fibonacci utilizando la fórmula F(n) = F(n-1) + F(n-2), donde F(0) = 0 y F(1) = 1.
  
7. **Impresión de resultados:**
   - Se imprimen los números primos y los números de la sucesión de Fibonacci en la pantalla.

### Definiciones

- **Número primo:** Un número natural mayor que 1 que solo tiene dos divisores distintos: 1 y sí mismo.

- **Sucesión de Fibonacci:** Una sucesión de números donde cada número es la suma de los dos anteriores. La sucesión comienza con 0 y 1, y continúa con 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
