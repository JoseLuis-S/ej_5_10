open class Empleado(nombre: String,
               edad: Int,
               val salarioBase: Double,
               open val porcentajeImpuestos: Double = 10.0
): Persona(nombre, edad) {

    open fun calcularSalario(): Double = salarioBase * (1 - porcentajeImpuestos / 100)

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Salario: ${String.format("%.2f", calcularSalario())}€"
    }

    fun trabajar() {
        println("$nombre esta trabajando.")
    }
}