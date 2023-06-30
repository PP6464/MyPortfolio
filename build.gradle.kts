plugins {
	kotlin("js") version "1.8.21"
}

group = "web.app"
version = "1.0"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(kotlin("test"))
	implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.568")
	implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.568")
	implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.1.2-pre.568")
	implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.6-pre.568")
	implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.12.1-pre.564")
	implementation("org.jetbrains.kotlin-wrappers:kotlin-mui-icons:5.11.16-pre.568")
	implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.1-pre.568")
	implementation("dev.gitlive:firebase-firestore:1.8.1")
	implementation("dev.gitlive:firebase-common:1.8.1")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.2")
	
}

kotlin {
	js {
		binaries.executable()
		browser {
			commonWebpackConfig {
				cssSupport {
					enabled.set(true)
				}
			}
		}
	}
}