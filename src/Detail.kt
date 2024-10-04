class Detail {
    var typeOfGrinding: String = ""
        get() {
            return field
        }
        set(value) {field = value}
    var typeOfDrilling: String = ""
        get() {
            return field
        }
        set(value) {field = value}
    var colour: String = ""
        get() {
            return field
        }
        set(value) {field = value}

    override fun toString(): String {
        return "Получившаяся деталь\nТип шлифовки = '$typeOfGrinding', \nТип сверления = '$typeOfDrilling', \nЦвет = '$colour'"
    }
}