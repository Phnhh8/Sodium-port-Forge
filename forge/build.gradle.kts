plugins {
    id("multiloader-platform")
    id("net.minecraftforge.gradle") version "[6.0,6.2)"
    id("org.spongepowered.mixin") version "0.7.+"
}

base {
    archivesName.set("sodium-forge")
}

minecraft {
    mappings("official", BuildConfig.MINECRAFT_VERSION)
    
    runs {
        create("client") {
            workingDirectory(project.file("run"))
            property("forge.logging.console.level", "debug")
            mods {
                create("sodium") {
                    source(sourceSets.main.get())
                    source(project(":common").sourceSets.main.get())
                }
            }
        }
    }
}

dependencies {
    minecraft("net.minecraftforge:forge:${BuildConfig.FORGE_VERSION}")
    implementation(project(":common"))
    annotationProcessor("org.spongepowered:mixin:0.8.5:processor")
}

mixin {
    add(sourceSets.main.get(), "sodium.refmap.json")
    config("sodium-forge.mixins.json")
}
