package ii_collections

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    return customers.groupBy { it.city }
}
