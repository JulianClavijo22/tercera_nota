# Unidad 3 — Excepciones

Este directorio contiene ejemplos simples sobre manejo de excepciones en Java.

Estructura relevante:
- `excepcion/` — ejemplo `SafeCalculator` y su `Main`.
- `usoadecuadoexcepcion/` — `DataLoader`, `AverageCalculator` y su `Main`.

Cómo compilar (desde la raíz del proyecto en PowerShell):

```powershell
javac -d bin src\unidad3\excepcion\*.java src\unidad3\usoadecuadoexcepcion\*.java
```

Cómo ejecutar los ejemplos:

```powershell
# Ejecutar el ejemplo de excepciones (SafeCalculator)
java -cp bin unidad3.excepcion.Main

# Ejecutar el ejemplo de uso adecuado de excepciones (DataLoader + AverageCalculator)
# Asegúrate de que exista un archivo `datos.txt` en la raíz del proyecto (o cambia el nombre en el código)
java -cp bin unidad3.usoadecuadoexcepcion.Main
```

Notas y recomendaciones:
- `datos.txt` fue agregado en la raíz del proyecto como ejemplo. Si prefieres, mueve `datos.txt` a `src/unidad3/usoadecuadoexcepcion/resources` y adapta `DataLoader` para cargarlo desde el classpath.
- Se agregó `Ejercicio.java` con las clases `DataLoader` y `AverageCalculator`. El archivo `Ejericicio.java` (con typo) fue eliminado para evitar duplicidades.
- Sugerencia: añadir pruebas unitarias (JUnit) para `SafeCalculator`, `DataLoader` y `AverageCalculator`.

Si quieres, puedo:
- mover `datos.txt` a `resources` y actualizar el código para cargarlo desde el classpath,
- agregar un README más detallado por subcarpeta,
- o crear pruebas unitarias (JUnit) y una tarea `build`.
