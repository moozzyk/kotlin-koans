package ii_collections

// Return the set of products ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> =
    customers.fold(allOrderedProducts, {
        orderedByAll, customer -> orderedByAll.intersect(customer.orderedProducts)
    })
