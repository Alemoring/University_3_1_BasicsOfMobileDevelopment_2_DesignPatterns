class Detail {
    var typeOfGrinding: String
        get() {
            TODO()
        }
        set(value) {}
    var typeOfDrilling: String
        get() {
            TODO()
        }
        set(value) {}
    var color: String
        get() {
            TODO()
        }
        set(value) {}

    override fun toString(): String {
        return "Получившаяся деталь\nТип шлифовки = '$typeOfGrinding', \nТип сверления = '$typeOfDrilling', \nЦвет = '$color'"
    }
}