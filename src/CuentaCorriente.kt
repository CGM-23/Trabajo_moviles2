
class CuentaCorriente(saldo: Float, tasaAnual: Float) : Cuenta(saldo, tasaAnual) {
    private var sobregiro: Float = 0f

    override fun retirar(cantidad: Float) {
        if (cantidad <= saldo) {
            saldo -= cantidad
        } else {
            sobregiro += (cantidad - saldo)
            saldo = 0f
        }
        numeroRetiros++
    }

    override fun consignar(cantidad: Float) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                saldo += (cantidad - sobregiro)
                sobregiro = 0f
            } else {
                sobregiro -= cantidad
            }
            numeroConsignaciones++
        } else {
            super.consignar(cantidad)
        }
    }

    override fun extractoMensual() {
        super.extractoMensual()
    }

    override fun imprimir() {
        println("------ Cuenta Corriente ------")
        println("Saldo: "+saldo)
        println("Comision mensual: "+comisionMensual)
        println("Transacciones: "+(numeroConsignaciones + numeroRetiros))
        println("Sobregiro: "+sobregiro)
        }
}
