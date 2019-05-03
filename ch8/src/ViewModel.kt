@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class ColorRes

class ViewModel(@get:ColorRes val resId:Int)