class Persona(var nombre: String, var peso: Double, var altura: Double, var imc: Double){

    constructor(peso: Double, altura: Double): this("Desconocido", peso, altura, peso / (altura * altura))

    constructor(nombre: String, peso: Double, altura: Double): this(nombre, peso, altura, peso / (altura * altura))

    override fun toString(): String {
        return "Nombre: $nombre, Peso: ${peso}kgs, Altura: ${altura}m, IMC: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Persona) {
            return false
        }
        return this.nombre == other.nombre &&
                this.peso == other.peso &&
                this.altura == other.altura &&
                this.imc == other.imc
    }

    fun preguntarNombre(): Boolean{
        println("Escriba su nombre por favor: ")
        val nombreNuevo = readln()

        if (nombreNuevo.isEmpty()){
            println("Lo siento, has introducido un formato inválido...")
            nombre = "Desconocido"
            return false
        } else {
            nombre = nombreNuevo
            return true
        }
    }

    fun saludar(persona: Persona): String{
        return "¡Saludos ${persona.nombre}!"
    }

    fun alturaEncimaMedia(persona: Persona): Boolean{
        if (persona.altura >= 1.75){
            return true
        } else {
            return false
        }
    }

    fun pesoEncimaMedia(persona: Persona): Boolean{
        if (persona.peso >= 70){
            return true
        } else {
            return false
        }
    }

    fun obtenerDesc(persona: Persona): String{
        return "${persona.nombre} con una altura de ${persona.altura}m " +
                "(${if (alturaEncimaMedia(persona)) "Por encima de la media" else "Por debajo de la media"}) y un peso de ${persona.peso}kg " +
                "(${if (pesoEncimaMedia(persona)) "Por encima de la media" else "Por debajo de la media"}) tiene un IMC de " +
                "${persona.imc} (${obtenerDescImc(persona)})"
    }


    fun obtenerDescImc(persona: Persona): String{
        if (persona.imc < 18.5){
            return "Peso insuficiente"
        } else if (persona.imc in 18.5..24.9) {
            return "Peso saludable"
        } else if (persona.imc in 25.0..29.9) {
            return "Sobrepeso"
        } else {
            return "Obesidad"
        }
    }


    override fun hashCode(): Int {
        return super.hashCode()
    }
}