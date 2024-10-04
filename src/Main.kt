import Builders.DetailBuilder

fun main() {
    val director = Director()
    val detailABuilder = DetailBuilder()
    val detailBBuilder = DetailBuilder()
    director.createDetailA(detailABuilder)
    director.createDetailB(detailBBuilder)
    val detailA = detailABuilder.getNowDetail()
    val detailB = detailBBuilder.getNowDetail()
    println(detailA)
    println()
    println(detailB)
}