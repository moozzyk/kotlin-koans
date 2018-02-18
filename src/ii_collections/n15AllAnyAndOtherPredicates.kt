package ii_collections

fun Customer.isFrom(city: City): Boolean = city == this.city

fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all{ it.isFrom(city) }

fun Shop.hasCustomerFrom(city: City): Boolean = customers.any{ it.isFrom(city) }

fun Shop.countCustomersFrom(city: City): Int = customers.count { it.isFrom(city) }

fun Shop.findFirstCustomerFrom(city: City): Customer? = customers.firstOrNull { it.isFrom(city) }
