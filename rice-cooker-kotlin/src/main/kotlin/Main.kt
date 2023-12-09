import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        menu()
        when (scanner.nextInt()) {
            1 -> println("Chauffer l'eau")
            2 -> println("Ajouter du riz")
            3 -> println("Commencer à cuire le riz")
            4 -> {
                println("Programme terminé")
                return
            }
            else -> println("Entrée invalide")
        }
    }
}

fun menu() {
    println(
        "Rice Cooker Programme, voici les fonctionnalités : \n" +
                "1. Chauffer l'eau\n" +
                "2. Ajouter du riz\n" +
                "3. Commencer à cuire le riz\n" +
                "4. Éteindre"
    )
}
