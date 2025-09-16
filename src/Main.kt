import java.util.*

// Programa principal interactivo
fun main() {
    val sc = Scanner(System.`in`)

    println("Bienvenido al sistema bancario en Kotlin")
    println("Seleccione el tipo de cuenta:")
    println("1. Cuenta de Ahorros")
    println("2. Cuenta Corriente")
    print("Opción: ")
    val opcion = sc.nextInt()

    print("Ingrese saldo inicial: ")
    val saldoInicial = sc.nextFloat()

    print("Ingrese tasa anual (%): ")
    val tasaAnual = sc.nextFloat()

    /*val cuenta: Cuenta = if (opcion == 1) {
        CuentaAhorros(saldoInicial, tasaAnual)
    } else {
        CuentaCorriente(saldoInicial, tasaAnual)
    }*/

    var continuar = true
    while (continuar) {
        println("\nSeleccione una operación:")
        println("1. Consignar")
        println("2. Retirar")
        println("3. Generar extracto mensual")
        println("4. Imprimir estado de la cuenta")
        println("5. Salir")
        print("Opción: ")

        when (sc.nextInt()) {

            else -> println(" Opción inválida")
        }
    }
}