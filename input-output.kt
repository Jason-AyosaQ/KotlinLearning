fun main(){
    println("==================================================")
    println("                  Sistema de Email                ")
    println("==================================================")

    print("Ingresa tu email: ")
    val email = readlnOrNull() ?: "no brindaste tu correo"

    print("Ingresa el destinatario: ")
    val destinatario = readlnOrNull() ?: "sin destinatario"

    print("Ingresa el asunto: ")
    val asunto = readlnOrNull() ?: "sin asunto"

    print("Ingresa tu mensaje: ")
    val mensajeNoLimpio = readlnOrNull()

    val mensajeLimpio = mensajeNoLimpio?.trim() ?: "sin mensaje"

    println("==================================================")
    println("                Vista previa Email                ")
    println("==================================================")

    println("De: $email" +
            "\nPara: $destinatario" +
            "\nAsunto: $asunto" +
            "\nMensaje: $mensajeLimpio")
}
