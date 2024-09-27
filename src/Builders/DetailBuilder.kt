package Builders
import Detail

class DetailBuilder: Builder {
    var detail = Detail()
    override fun reset() {
        detail = Detail()
    }

    override fun grinding() {
        TODO("Not yet implemented")
    }

    override fun drilling() {
        TODO("Not yet implemented")
    }

    override fun painting() {
        TODO("Not yet implemented")
    }
    fun getDetail(): Detail{
        return detail
    }
}