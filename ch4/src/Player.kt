class Player : Movable, Drawable {

    override fun move(currentTime: Long) {
        // add logic
    }

    override fun draw() {
        // add logic
    }

    override fun update(currentTime: Long) {
        super<Movable>.update(currentTime)
        super<Drawable>.update(currentTime)
    }
}

