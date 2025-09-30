# 🧮 OrdenarNumeros

Módulo de ordenación de números en Java con Maven — segunda parte del sistema.

---

## 🧩 Descripción

Este proyecto corresponde a la **segunda parte** del sistema general. Su función es recibir números y ordenarlos (ascendente/descendente). Se empaqueta como `.jar` usando Maven.

---

## 🚀 Funcionalidades

- Ordenar colecciones de números.  
- Soporte para distintos criterios (ascendente / descendente).  
- Lectura desde consola, archivo o entrada estándar (según implementación).  
- Salida ordenada en consola o archivo.  
- Puede recibir como entrada el resultado del módulo Aleatorio.

---

## 🏗️ Estructura del proyecto (Maven)

```
OrdenarNumeros/
├── pom.xml
└── src/
    └── main/
        └── java/
```

---

## 🛠️ Uso / instrucciones

1. Clona el repositorio:  
   ```bash
   git clone https://github.com/JotaMynds/OrdenarNumeros.git
   cd OrdenarNumeros
   ```

2. Compila y empaqueta con Maven:  
   ```bash
   mvn clean package
   ```

   Esto generará un `.jar` en `target/`, por ejemplo `OrdenarNumeros-<version>.jar`.

3. Ejecuta el `.jar` (si la clase principal está configurada):  
   ```bash
   java -jar target/OrdenarNumeros-<version>.jar [opciones]
   ```

---

## 🔗 Flujo conjunto: Aleatorio → OrdenarNumeros

```bash
java -jar Aleatorio-1.0.jar --output numeros.txt
java -jar OrdenarNumeros-1.0.jar --input numeros.txt --output numeros_ordenados.txt
```

---

## 🧑‍💻 Autor

- [JotaMynds](https://github.com/JotaMynds)
