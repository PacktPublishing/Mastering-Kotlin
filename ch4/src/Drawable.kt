interface Drawable {
    fun draw()
    fun update(currentTime: Long){
        println("$this drawable update:")
    }
}