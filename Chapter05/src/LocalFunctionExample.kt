
class Response<T>(val isSuccess: Boolean, val error: Throwable?, val data: T, val code: Int)

fun handleNetworkResponse(response: Response<Person>) {
    val errorMsgPrefix = "Error occured: "

    fun handleSuccess(person: Person) {
        // handle successful response
    }

    fun handleError(error: Throwable?) {
        println(errorMsgPrefix + " with code ${response.code}" + error?.message)
    }

    when (response.isSuccess) {
        true -> handleSuccess((response.data))
        false -> handleError(response.error)
    }
}