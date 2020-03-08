package main

fun main(args: Array<string>) {
    val menu = """
        ::RECETARIO::
        
        Selecciona una opcion:
        1.-Hacer una Receta
        2.-Ver mis Recetas
        3.-Salir
        """.trimMargin().trimIndent()
    println(menu)
    val opcion: string? = readLine()
    var a = 0
    do{
        a++
        when (opcion) {
            "1" -> println("Elegiste la opcion 1, hacer una recea")
            "2" -> println("Elegiste la opcion 2, ver mis recetas")
            "3" -> println("Elegiste la opcion 3, salir, Vuelve pronto")
            else -> println("Opcion invalida")


        }
    }while (opcion != "3" && a < 1)
}
