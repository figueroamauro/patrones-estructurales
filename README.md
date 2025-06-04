# Patrones de Diseño Estructurales

Los **patrones estructurales** se enfocan en **cómo componer clases y objetos** para formar estructuras más grandes y flexibles, manteniendo la eficiencia y facilidad de uso.

Estos patrones ayudan a definir relaciones claras y reutilizables entre clases u objetos.

---

## 📦 Lista de Patrones Estructurales

### 1. Adapter
- **Propósito**: Permite que dos interfaces incompatibles trabajen juntas.
- **Ejemplo**: Convertir una interfaz antigua en una nueva sin modificar el código existente.

---

### 2. Bridge
- **Propósito**: Separar la abstracción de su implementación para que ambas puedan variar independientemente.
- **Ejemplo**: Diferentes formas de dibujar figuras (vectorial o raster) usando la misma interfaz `Forma`.

---

### 3. Composite
- **Propósito**: Componer objetos en estructuras de árbol para representar jerarquías parte-todo.
- **Ejemplo**: Estructuras de menús, sistemas de archivos (carpetas y archivos).

---

### 4. Decorator
- **Propósito**: Añadir funcionalidades a un objeto dinámicamente sin alterar su estructura.
- **Ejemplo**: Agregar responsabilidades a objetos (como logs, seguridad, compresión).

---

### 5. Facade
- **Propósito**: Proporciona una interfaz unificada y simple a un conjunto de interfaces complejas de un subsistema.
- **Ejemplo**: API que oculta lógica compleja detrás de un solo punto de entrada.

---

### 6. Flyweight
- **Propósito**: Usar objetos compartidos para reducir el uso de memoria cuando hay muchos objetos similares.
- **Ejemplo**: Caracteres en un editor de texto, celdas de un tablero.

---

### 7. Proxy
- **Propósito**: Controlar el acceso a un objeto mediante un intermediario.
- **Ejemplo**: Cargar imágenes bajo demanda, validar acceso a recursos.

---

## 🧠 Ventajas de los Patrones Estructurales

- Aumentan la **flexibilidad y mantenibilidad** del código.
- Facilitan la **reutilización** de clases y objetos.
- Permiten construir sistemas más **robustos** y **modificables**.

---
