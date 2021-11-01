//final task on module 02 by alexey seikin

//Даны два строковых списка words1 и words2 имеющих произвольную длину.
//Верните один список, содержащий в себе все элементы из данных списков,
//отсортированные по возрастанию.

//Пример входных данных:
//val words1 = mutableListOf("Android", "Windows", "macOS", "Linux", "DOS", "FreeBSD")
//val words2 = mutableListOf("Kotlin", "Java", "PHP", "JavaScript", "C++", "GoLang")
//Пример вывода:
//[Android, C++, DOS, FreeBSD, GoLang, Java, JavaScript, Kotlin, Linux, PHP, Windows, macOS]
fun main() {
    val words1 = mutableListOf("Android", "Windows", "macOS", "Linux", "DOS", "FreeBSD")
    val words2 = mutableListOf("Kotlin", "Java", "PHP", "JavaScript", "C++", "GoLang")

    val unitedlist = mutableListOf<String>()

    for (i in words1) {
       unitedlist.add(i)
    }

    for (i in words2) {
        unitedlist.add(i)
    }

    unitedlist.sortByDescending { it.first() }
    println(unitedlist.reversed())
}
//Направьте, как в выведенном отсортированном списке сделать еще и одновременную сортирвку по длинне, чтоб
//Java шла впереди Javascript?

