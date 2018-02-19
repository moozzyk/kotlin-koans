package ii_collections

// Return the sum of prices of all products that a customer has ordered.
// Note: a customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double =
        orders.flatMap { it.products }.sumByDouble { it.price }
