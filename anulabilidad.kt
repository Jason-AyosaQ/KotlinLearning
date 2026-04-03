fun main() {
    println("-----------------------------------------------------")
    println("                        CLASE                        ")
    println("-----------------------------------------------------")
    val email: String = "usuario@email.com"
    var emailOpcional: String? = null
    println(emailOpcional)

    emailOpcional = "nuevoCorreo@email.com"
    println(emailOpcional)

    emailOpcional = null
    var longitudEmail = emailOpcional?.length ?: 0
    println("Longitud del correo: $longitudEmail caracteres")

    println("------------------------------------------------------")

    emailOpcional = "nuevoCorreo2@email.com"
    longitudEmail = emailOpcional?.length ?: 0

    var longitudForzada = emailOpcional!!.length ?: 0
    println("Longitud del correo: $longitudEmail caracteres")
    println("Longitud del correo forzada: $longitudEmail caracteres")

    /*
     Escribir un programa que declare un email y un nombre opcional. Si el nombre no tiene valor, debe reemplazarse
     por "Anónimo" por defecto.
     Luego, calcular de forma segura la longitud del nombre. Si no  tiene valor, establecer por defecto 0.
     Finalmente, mostrar el email, el nombre final y la longitud obtenida.
    */

    println("-----------------------------------------------------")
    println("                      EJERCICIO                      ")
    println("-----------------------------------------------------")
    println("Crea variables para: email (obligatorio), nombre (opcional)")
    println("Usa ?: para mostrar 'Anónimo' si nombre es null")
    println("Usa ?. para obtener la longitud del nombre de forma segura")

    val miEmail: String = "Jason@xample.com"
    val nombre: String? = null
    val mostrarNombre = nombre ?: "Anonimo"
    val longitudNombre = nombre?.length ?: 0
    println("--------------------Datos----------------------")
    println("Email: $miEmail" +
            "\nNombre: $mostrarNombre" +
            "\nLongotud nombre: $longitudNombre caracteres")
    println("-----------------------------------------------")
}
