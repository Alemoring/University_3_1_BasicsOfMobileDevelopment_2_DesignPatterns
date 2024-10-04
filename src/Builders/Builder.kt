package Builders

interface Builder {
    fun reset()
    fun grinding(type : String)
    fun drilling(type : String)
    fun painting(colour : String)
}