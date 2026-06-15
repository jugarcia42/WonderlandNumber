# Wonderland Number (5 digits)

## Descripción

Wonderland Number es un kata de programación basado en un problema de lógica numérica y restricciones sobre dígitos.

En esta variante, el objetivo es encontrar un número de **5 cifras** que cumpla una propiedad muy concreta: al multiplicarlo por distintos factores, el resultado debe contener exactamente los mismos dígitos, sin repeticiones dentro del número ni colisiones entre dígitos en los resultados.

## Problema

Se busca un número de 5 dígitos que cumpla las siguientes condiciones:

- Es un número de exactamente 5 cifras.
- Todos sus dígitos son distintos entre sí.
- Al multiplicarlo por ciertos números (según el enunciado del kata), los resultados obtenidos deben estar formados por dígitos todos diferentes.
- Además, los dígitos resultantes deben seguir cumpliendo la propiedad de no repetirse dentro del propio número.

## Idea del ejercicio

El problema se basa en encontrar un número “especial” que mantiene una estructura de dígitos única bajo multiplicaciones, lo que implica fuertes restricciones combinatorias.

No se trata de un cálculo directo, sino de una búsqueda con validación de condiciones sobre los dígitos.

## Conceptos trabajados

- Programación en Java
- Búsqueda exhaustiva (brute force)
- Manipulación de dígitos
- Validación de unicidad
- Conjuntos (`Set`)
- Optimización de búsqueda
- Lógica combinatoria

## Estrategia de solución

Una aproximación típica consiste en:

1. Iterar sobre todos los números de 5 cifras.
2. Filtrar aquellos con dígitos repetidos.
3. Multiplicar el número por los factores indicados en el ejercicio.
4. Verificar que:
   - No hay dígitos repetidos en cada resultado.
   - Los dígitos cumplen las restricciones globales del problema.
5. Guardar o devolver el número que cumple todas las condiciones.

## Ejemplo de validación

Para un número candidato `ABCDE`:

```text
ABCDE × k → resultado válido si:
- todos los dígitos del resultado son distintos
- no hay repeticiones internas
```

## Objetivo

El objetivo del kata es practicar:

- Resolución de problemas con restricciones fuertes
- Manejo de dígitos numéricos
- Uso de estructuras de datos como sets
- Algoritmos de búsqueda y filtrado
- Pensamiento combinatorio

## Autor

Ejercicio realizado como parte de las prácticas de Cyber Dojo utilizando Java.
