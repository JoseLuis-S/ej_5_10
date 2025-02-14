class Gerente(nombre: String,
              edad: Int,
              salarioBase: Double,
              porcentajeImpuestos: Double,
              val bonus: Double,
              var exentoImpuestos: Boolean = false
): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    override val porcentajeImpuestos = 33.99

    override fun calcularSalario(): Double {
        if (!exentoImpuestos) return super.calcularSalario() * bonus
        else return salarioBase * bonus
    }

    override fun toString(): String {
        return super.toString() + "Datos gerente: Bonus: $bonus, Exento de impuestos: $exentoImpuestos"
    }

    fun administrar() = println("$nombre esta administrando.")
}