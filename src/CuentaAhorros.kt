class CuentaAhorros(saldo: Float, tasaAnual: Float) : Cuenta(saldo, tasaAnual) {
    private var activa: Boolean = saldo >= 10000

    override fun consignar(cantidad: Float) {
        if (activa) {
            super.consignar(cantidad)
        } else {
            println("No se puede consignar porque su cuenta inactiva")
        }
    }

    override fun retirar(cantidad: Float) {
        if (activa) {
            super.retirar(cantidad)
        } else {
            println("No se puede retirar porque su cuenta está inactiva")
        }
    }

    override fun extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000
        }
        super.extractoMensual()
        activa = saldo >= 10000

    }

    override fun imprimir() {
        println("/////////////////Cuenta de Ahorros\\\\\\\\\\\\\\\\\")
        println("Saldo: " + saldo)
        println("Comisión mensual: " + comisionMensual)
        println("Transacciones: " numeroConsignaciones + numeroRetiros)
        println("Activa: " + activa)
    }
}
