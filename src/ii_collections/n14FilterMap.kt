package ii_collections

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    return this.customers.map { it.city }.toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    return this.customers.filter { it.city == city }
}


