interface SettingsProvider {
    fun getSetting(key: String) : String
}

object SettingsManager() : SettingsProvider {
    val map = HashMap<String, String>()

    fun printSettings() = map.forEach { println(it) }

    override fun getSetting(key: String)
            = map.getOrDefault(key, "default")
}

class UserManager(settingsProvider: SettingsProvider) : SettingsProvider by settingsProvider

fun main(args: Array<String>) {
    val settingsProvider: SettingsProvider = SettingsManager
    if (settingsProvider is SettingsManager) {
        settingsProvider.printSettings()
    }

    val setting = SettingsManager.getSetting("key")
}