package iv_properties

import util.TODO
import util.doc32

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = 0
        set(value) {
            field = value
            counter++
        }
}

