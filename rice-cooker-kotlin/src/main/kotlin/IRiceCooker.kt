interface IRiceCooker {
    fun cook(minutes: String)
    fun boil(minutes: String)
    fun powerOn(power: Boolean)
    fun powerOff(power: Boolean)
    fun keepWarm(status: Boolean)
    fun stopWarm(status: Boolean)
}
