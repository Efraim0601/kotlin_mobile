package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

/*
    init {
        println("aquarium initializing")
    }



    //secondary constructor
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }



    //let define a int value o test getter
*/
    open val shape = "rectangle"
    open var water : Double = 0.0
        get() = volume * 0.9
    open var volume: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }
    fun printSize() {
            /*println("Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
            )
            // 1 liter = 1000 cm^3
            println("Volume: $volume liters")

             */
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")

    }



}