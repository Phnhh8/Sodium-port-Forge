pluginManagement {
    repositories {
        maven("https://fabricmc.net") {
            name = "Fabric"
        }
        maven("https://neoforged.net") {
            name = "NeoForged"
        }
        maven("https://minecraftforge.net") {
            name = "MinecraftForge"
        }
        maven("https://spongepowered.org") {
            name = "Sponge"
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "sodium"

include(":common")
include(":forge")
