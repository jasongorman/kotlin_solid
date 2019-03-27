fun carpet(pricePerSqrMetre: Double, roundUp: Boolean): (Double) -> (Double) {
    fun price(roomArea : Double) : Double {
        var carpetArea = roomArea

        if (roundUp)
            carpetArea = Math.ceil(carpetArea)

        return pricePerSqrMetre * carpetArea
    }
    return ::price
}