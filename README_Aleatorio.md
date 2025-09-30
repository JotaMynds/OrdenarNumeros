# 🎲 Aleatorio

Generador de números aleatorios en Java con Maven.

---

## 🧩 Descripción

Este proyecto es la **primera parte** del sistema completo: su objetivo es generar números aleatorios que luego podrán pasarse al módulo de ordenación (*OrdenarNumeros*). Con Maven se puede compilar y empaquetar este módulo en un `.jar`.

---

## 🚀 Funcionalidades

- Generar una cantidad definida de números aleatorios.  
- Posibilidad de configurar el rango (mínimo / máximo).  
- Salida en consola o en archivo (según implementación).  
- Preparado para integrarse con el módulo de ordenación.

---

## 🏗️ Estructura del proyecto (Maven)

```
Aleatorio/
├── pom.xml
└── src/
    └── main/
        └── java/
```

---

## 🛠️ Uso / instrucciones

1. Clona el repositorio:  
   ```bash
   git clone https://github.com/JotaMynds/Aleatorio.git
   cd Aleatorio
   ```

2. Compila y empaqueta con Maven:  
   ```bash
   mvn clean package
   ```

   Esto generará un `.jar` en `target/`, por ejemplo `Aleatorio-<version>.jar`.

3. Ejecuta el `.jar` (si tiene clase principal configurada):  
   ```bash
   java -jar target/Aleatorio-<version>.jar [opciones]
   ```

---

## 🔄 Integración con *OrdenarNumeros*

El `.jar` resultante de este módulo se usará como fuente de datos (números aleatorios) para el módulo de ordenación.  

---

## 🧑‍💻 Autor

- [JotaMynds](https://github.com/JotaMynds)
