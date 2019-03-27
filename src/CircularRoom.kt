fun circularRoom(radius: Double) : () -> (Double) {
    fun area() : Double {
        // a square carpet of length 2x radius is required to cut out a circle
        return (radius * 2) * (radius * 2)
    }
    return ::area
}