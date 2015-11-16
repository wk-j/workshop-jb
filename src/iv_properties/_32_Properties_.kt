package iv_properties

import util.*

class PropertyExample() {
    var counter = 0
    private  var property:Int? = 0
    var propertyWithCounter: Int?
        set(v) {
            this.counter ++;
            this.property = v
        }
        get() {
            return this.property;
        }
}

fun todoTask32(): Nothing = TODO(
    """
        Task 32.
        Add a custom setter to PropertyExample.propertyWithCounter so that
        the 'counter' property is incremented every time 'propertyWithCounter' is assigned to.
    """,
    documentation = doc32(),
    references = { PropertyExample() }
)
