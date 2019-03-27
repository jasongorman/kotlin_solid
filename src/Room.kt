fun room(width: Double, length: Double) : () -> (Double) {
    fun area() : Double {
        return width * length
    }
    return ::area
}