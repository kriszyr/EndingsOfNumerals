fun main() {
    val likes = 22
    val length = likes.toString().length
    val endingsNumber = if (length > 1) likes.toString()[length - 2] else "0"
    val endingsOfNumerals = if (likes % 10 == 1 && endingsNumber != 1) "человеку" else "людям"

    println("$likes $endingsOfNumerals")
}