fun quote(area: () -> (Double), price: (Double) -> (Double)) : Double{
    return price(area())
}

