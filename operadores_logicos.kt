package org.example.clase6

fun main(){

    println("-------Clase--------")
    // Lo nuevo aquí es que hay variables cuya expresión Son comparaciones
    val emailRecibidos = 15
    val emailsEnviados = 16
    val limiteEmails = 20

    val tieneEmails = emailRecibidos > 16
    val excedeEnviados  = emailsEnviados >= limiteEmails

    println("Tiene emails ? ${tieneEmails} ")
    println("Alcanzamos el limite de emails enviados ? ${excedeEnviados} ")

    val sonIguales = emailRecibidos == emailsEnviados

    println("Son iguales ? :$sonIguales")
    val sonDiferentes = emailRecibidos != emailsEnviados
    println("Son diferentes? :$sonDiferentes ")


    val email = "user@example.com"
    val password = "1234"

    val tieneArroba = email.contains("@")
    val tienePunto = email.contains(".com")
    val esEmailValido = tieneArroba && tienePunto //AND


    println("Es email valido? $esEmailValido")

    val passwordCorto = password.length < 6
    val passwordLargo = password.length > 20
    val passwordProblematico = passwordCorto || passwordLargo // OR
    println("Es una contraseña problematica ? $passwordProblematico")

    val emailInvalido = !esEmailValido //! true - false; false - true

    println("Es un email invalido?$emailInvalido")


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
