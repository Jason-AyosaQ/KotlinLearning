package org.example.clase6

fun main(){
    
    println("-------Clase--------")
    // Lo nuevo aquí es que hay variables cuya expresión Son comparaciones
    val emailsRecibidos = 15
    val emailsEnviados = 20
    val limiteEmails = 20
    val tieneEmails = emailsRecibidos > 0
    val excedeEnviados = emailsEnviados >= limiteEmails
    val sonIguales = emailsEnviados == emailsRecibidos
    println("Tiene emails? $tieneEmails")
    println("Alcanzamos el límite de Emails? $excedeEnviados")
    println("Los emails recibidos son iguales a los enviados? $sonIguales")
    val email = "example.@gmail.com"
    val password = "1234"
    val tieneArroba = email.contains("@")
    val tienePunto = email.contains(".")
    val emailValido = tienePunto && tieneArroba
    println("Es un correo válido? $emailValido")

    val passwordCorto =password.length < 6
    val passwordLargo = password.length > 20
    val passwordProblematico = passwordCorto && passwordLargo
    println("Es una clave problematica? $passwordProblematico")

    val emailInvalido = !emailValido
    println("Es un emaIL invalido? $emailInvalido")
  

    /*
    Ejercicio: valida email: debe tener @ y . no debe contener test
    Valida que no sea spam: asunto no debe tener 'GRATIS' O 'URGENTE
    Luego, verifica si es un email aceptable
    */

    println("------Ejercicio------")
    val email2: String = "Ejemplo@gmail.com"
    val asunto: String = "Adquiere esta super oferta URGENTE"

    // Validación de Email
    val tieneArroba2: Boolean = email2.contains("@")
    val tienePunto2: Boolean = email2.contains(".")

    // Verificar spam
    val tieneTest: Boolean = email2.contains("test")

    val emailValido2: Boolean = tieneArroba2 && tienePunto2 && !tieneTest
    val noSpam: Boolean = !asunto.contains("GRATIS") || !asunto.contains("URGENTE")
    println("El email es válido? $emailValido2")
    println("Tiene spam? ${noSpam}")

    // Email aceptable
    val emailAceptableTest: Boolean = emailValido2 && noSpam
    println("Email aceptable? ${emailAceptableTest}")



}
