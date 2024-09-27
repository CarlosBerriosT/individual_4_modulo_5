
open class Phone(var isScreenLightOn: Boolean = false) {

    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "encendida" else "apagada"
        println("La pantalla del teléfono está $phoneScreenLight.")
    }
}


class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {


    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        } else {
            println("No se puede encender, el teléfono está plegado.")
        }
    }


    fun fold() {
        isFolded = true
        println("El teléfono está plegado.")
    }

    fun unfold() {
        isFolded = false
        println("El teléfono está desplegado.")
    }
}

// No sabía si agregar el resultado por pantalla, asi que lo hice de todas formas
fun main() {
    val miTelefono = FoldablePhone()


    miTelefono.fold()
    miTelefono.switchOn()
    miTelefono.checkPhoneScreenLight()


    miTelefono.unfold()
    miTelefono.switchOn()
    miTelefono.checkPhoneScreenLight()
}
