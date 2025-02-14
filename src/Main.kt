fun main() {
    val persona1 = Persona("Pedro", 32)
    val empleado1 = Empleado("Manolo", 56, 1500.0)
    val gerente1 = Gerente("Gemma", 60, 2300.0, 0.0, 1.5)

    persona1.celebrarCumple()
    println(persona1.toString())

    empleado1.calcularSalario()
    empleado1.celebrarCumple()
    empleado1.trabajar()
    println(empleado1)

    gerente1.calcularSalario()
    gerente1.celebrarCumple()
    gerente1.calcularSalario()
    gerente1.administrar()
    println(gerente1)
}