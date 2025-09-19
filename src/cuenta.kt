
open class Cuenta(
    protected var saldo: Float,
    protected var tasaAnual: Float
) {
    protected var numeroConsignaciones: Int = 0
    protected var numeroRetiros: Int = 0
    protected var comisionMensual: Float = 0f

    open fun consignar(cantidad: Float) {
        saldo += cantidad
        numeroConsignaciones++
    }

    open fun retirar(cantidad: Float) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            numeroRetiros++
        } else {
            println(" No se puede retirar: saldo insuficiente")
        }
    }

    protected fun calcularInteresMensual() {
        val interesMensual = (tasaAnual / 12) * saldo / 100
        saldo += interesMensual
    }

    open fun extractoMensual() {
        saldo -= comisionMensual
        calcularInteresMensual()
        println("el nuevo saldo es: "+saldo)
    }

    open fun imprimir() {
        println("Saldo: "+saldo)
        println("Número de consignaciones: "+numeroConsignaciones)
        println("Número de retiros: "+numeroRetiros)
        println("Tasa anual: "+tasaAnual+"%")
        println("Comisión mensual: "+comisionMensual)
        }
}
