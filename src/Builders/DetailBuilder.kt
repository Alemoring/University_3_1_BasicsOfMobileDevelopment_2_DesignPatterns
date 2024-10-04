package Builders
import Detail

class DetailBuilder: Builder {
    private var detail = Detail()
    override fun reset() {
        detail = Detail()
    }

    override fun grinding(type : String) {
        detail.typeOfGrinding = type
    }

    override fun drilling(type : String) {
        detail.typeOfDrilling = type
    }

    override fun painting(colour : String) {
        detail.colour = colour
    }
    fun getNowDetail(): Detail{
        return detail
    }
}