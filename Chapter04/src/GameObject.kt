interface GameObject {
    val id: String
        get() = "defaultId"
    fun update(currentTime: Long){
        println("id: $id update:")
    }
}