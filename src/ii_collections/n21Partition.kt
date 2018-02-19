package ii_collections

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
        customers.partition { it.orders.size > it.orders.filter { it.isDelivered }.size }.first.toSet()
