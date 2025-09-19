import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Bienvenido al sistema bancario en Kotlin")
    var continuar = true
    while (continuar) {

        println("Seleccione el tipo de cuenta:")
        println("1. Cuenta de Ahorros")
        println("2. Cuenta Corriente")
        println("3. Salir")
        print("Opcion: ")
        val opcion = sc.nextInt()

        if (opcion == 3) {
            println("Gracias por usar el sistema bancario.")
            break
        }

        if (opcion != 1 && opcion != 2) {
            println("Opcion invalida. Por favor, intente nuevamente.")
            continue
        }
        print("Ingrese saldo inicial: ")
        val saldoInicial = sc.nextFloat()

        print("Ingrese tasa anual (%): ")
        val tasaAnual = sc.nextFloat()
        val cuenta: Cuenta = if (opcion == 1) {
            CuentaAhorros(saldoInicial, tasaAnual)
        } else {
            CuentaCorriente(saldoInicial, tasaAnual)
        }

        var realizarOperaciones = true
        while (realizarOperaciones) {
            val activa = cuenta.estaActiva()
            println("----------------------------")
            println("Seleccione una operacion:")
            if (activa) {
                println("1. Consignar")
                println("2. Retirar")
                println("3. Generar extracto mensual")
                println("4. Imprimir estado de la cuenta")
                println("5. Salir al menú principal")
            } else {
                println("Cuenta inactiva al ser menor a 10000")
                println("1. Imprimir estado de la cuenta")
                println("2. Salir al menu principal")
            }
            print("Opcion: ")
            val opcionOperacion = sc.nextInt()

            if (activa) {
                when (opcionOperacion) {
                    1 -> {
                        print("Digite cantidad a consignar: ")
                        val cantidad = sc.nextFloat()
                        cuenta.consignar(cantidad)
                    }
                    2 -> {
                        print("Digite cantidad a retirar: ")
                        val cantidad = sc.nextFloat()
                        cuenta.retirar(cantidad)
                    }
                    3 -> cuenta.extractoMensual()
                    4 -> cuenta.imprimir()
                    5 -> {
                        realizarOperaciones = false
                        println("Volviendo al menu principal...")
                    }
                    else -> println("Opcion invalida. Intente nuevamente")
                }
            } else {
                when (opcionOperacion) {
                    1 ->  cuenta.imprimir()
                    2 -> {
                        realizarOperaciones = false
                        println("Volviendo al menu principal...")
                    }
                    else -> println("Opcion invalida. Intente nuevamente")
                }
            }
        }
    }
}
