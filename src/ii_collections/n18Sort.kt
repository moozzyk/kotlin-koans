package ii_collections

fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> =
        customers.sortedBy { it.orders.size }
