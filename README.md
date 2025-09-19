<div align="center">
  <h1>Sistema de Gestión Bancaria en Kotlin</h1>
</div>

![Portada del Proyecto](./Portada.png)

---

### 👤 Integrantes
* **Nombre:** Claudio Camilo Gonzales Mendieta
* **Código:** `22200020`
* **Nombre:** Jhair Roussell Melendez Blas
* **Código:** `22200199`

---

### 📂 Descripción del Programa

Este repositorio contiene un programa que simula la gestión de cuentas bancarias, desarrollado en **Kotlin** para el curso de Desarrollo de Sistemas Móviles. El proyecto aplica los principios de la **Programación Orientada a Objetos** para modelar el comportamiento de diferentes tipos de cuentas.

El sistema se estructura en las siguientes clases:

* **`Cuenta` (Clase Padre):**
    * Define los atributos y métodos base para cualquier tipo de cuenta, como `saldo`, `tasaAnual`, y las operaciones de `consignar()`, `retirar()`, `extractoMensual()` e `imprimir()`.

* **`CuentaAhorros` (Clase Hija):**
    * Hereda de `Cuenta` y añade lógica específica:
    * La cuenta se considera **inactiva** si el saldo es inferior a $10,000. Si está inactiva, el menú de operaciones cambia dinámicamente para mostrar opciones limitadas, restringiendo depósitos y retiros.
    * Aplica una comisión adicional si se superan los 4 retiros mensuales.

* **`CuentaCorriente` (Clase Hija):**
    * Hereda de `Cuenta` y permite **sobregiros**. Si un retiro excede el saldo, la diferencia se cubre con un sobregiro que deberá ser pagado en futuras consignaciones.

#### Ejecución del Menú Interactivo:
El programa presenta un menú en la consola que se adapta según el estado de la cuenta de ahorros. Si el saldo baja de S/. 10,000, la cuenta se vuelve inactiva y algunas opciones se restringen, si es mayor a S/.10,000 se habilitan todas las funciones.


Pruebas de funcionalidad:
- Menú principal:
- Opción uno que es ingresar saldo inicial, la tasa anualhaces una consugnacion consultas tu saldo y generas extracto mensual:
- ahora en este ejemplo se creó una Cuenta Corriente con saldo inicial de 5,000 y tasa anual de 12%. Al retirar 7,000, el saldo quedó en 0 y se generó un sobregiro de 2,000. Luego, al consignar 3,000, primero se cubrió el sobregiro y el saldo pasó a 1,000. Al generar el extracto mensual, se aplicó el interés correspondiente (1% del saldo), quedando un saldo final de 1,010, sin sobregiro:


### 🚀 Cómo se Usa

Para ejecutar este programa, necesitarás tener **IntelliJ IDEA** instalado en tu computadora.

1.  **Clonar el Repositorio**
    ```sh
    git clone https://github.com/CGM-23/Trabajo_moviles2.git
    ```

2.  **Abrir en IntelliJ IDEA**
    * Abre el programa y selecciona `File > Open...` y elige la carpeta del proyecto que acabas de clonar.

3.  **Ejecutar el Programa**
    * Navega en el panel izquierdo a la carpeta `src`.
    * Abre el archivo que contiene la función `main` (por ejemplo, `Main.kt`).
    * Haz clic en el ícono de **Play (▶️) verde** que aparece a la izquierda de la función `main`.
    * Selecciona la opción **"Run"** para iniciar el programa en la consola. ¡Y listo!

---

### 🛠️ Tecnología Utilizada
* **Lenguaje:** Kotlin
* **Entorno de Desarrollo:** IntelliJ IDEA Community Edition
