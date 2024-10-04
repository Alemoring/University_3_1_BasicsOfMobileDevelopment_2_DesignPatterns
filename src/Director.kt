import Builders.Builder

class Director {
    fun createDetailA(builder : Builder){
        builder.reset()
        builder.grinding("Круглое")
        builder.drilling("Спиральное")
        builder.painting("Красный")
    }
    fun createDetailB(builder : Builder){
        builder.reset()
        builder.grinding("Глубинное")
        builder.drilling("Корончатое")
        builder.painting("Зелёный")
    }
}