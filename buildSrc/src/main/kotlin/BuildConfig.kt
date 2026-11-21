import org.gradle.api.Project

object BuildConfig {
    const val MINECRAFT_VERSION = "1.20.1"
    const val FORGE_VERSION = "1.20.1-47.3.0"
    const val NEOFORGE_VERSION = "20.4.237"
    const val FABRIC_LOADER_VERSION = "0.15.11"
    const val FABRIC_API_VERSION = "0.92.2+1.20.1"
    const val JAVA_VERSION = 17
    const val MOD_VERSION = "0.6.0-forge-1.20.1"

    const val CURSEFORGE_PROJECT_ID = ""
    const val MODRINTH_PROJECT_ID = ""
    const val RELEASE_TAG = "0.6.0"

    fun createVersionString(project: Project): String {
        return "$MOD_VERSION+mc$MINECRAFT_VERSION"
    }

    fun getChangelog(project: Project): String {
        return "Sodium Forge 1.20.1 Port"
    }

    fun calculateGitHash(project: Project): String {
        return "0000000"
    }
}
