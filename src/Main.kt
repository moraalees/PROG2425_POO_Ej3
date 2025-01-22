fun main(){
    val persona1 = Persona("Addisyn", 52.4, 1.55)

    println(persona1.saludar(persona1))
    println(persona1.obtenerDesc(persona1))


    val persona2 = Persona(58.8, 1.61)

    println(persona2.saludar(persona2))
    println(persona2.obtenerDesc(persona2))


    val persona3 = Persona("YMCA", 105.4, 2.11)

    println(persona3.saludar(persona3))
    println(persona3.obtenerDesc(persona3))

    val persona4 = Persona(60.2, 1.70)

    println(persona4.saludar(persona4))
    println(persona4.obtenerDesc(persona4))
}