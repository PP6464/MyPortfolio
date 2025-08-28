package pages

import js.core.jso
import kotlinx.browser.window
import org.w3c.dom.SMOOTH
import org.w3c.dom.ScrollBehavior
import org.w3c.dom.ScrollToOptions
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.p
import react.router.useLocation
import react.useEffect
import web.cssom.ClassName
import web.cssom.px
import web.dom.document
import web.window.WindowTarget

val MyCode = FC<Props> {
	val location = useLocation()
	useEffect {
		val navbarHeight = if (window.innerWidth < 1000) 0.15 * window.innerHeight + 20 else 0.1 * window.innerHeight + 60
		if (location.hash.isNotEmpty()) {
			val el = document.querySelector(location.hash)
			if (el !== null) {
				val elementPosition = el.getBoundingClientRect().top + window.pageYOffset
				val scrollPosition = elementPosition - navbarHeight
				window.scrollTo(ScrollToOptions(top = scrollPosition, behavior = ScrollBehavior.SMOOTH))
			}
		}
	}

	div {
		id = "my-code-container"
		className = ClassName("container")
		img {
			src = "/code-background.png"
			alt = ""
			className = ClassName("code-background")
		}
		div {
			className = ClassName("white-background")
		}
		img {
			src = "/panth-pic.png"
			alt = ""
			className = ClassName("panth-pic")
		}
		h1 {
			+"My Code"
		}
		h3 {
			id = "kotlin-react"
			style = jso {
				marginTop = 10.px
			}
			+"Kotlin React"
		}
		p {
			className = ClassName("my-code-name")
			+"My portfolio (this website)"
		}
		div {
			a {
				href = "https://github.com/PP6464/MyPortfolio"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "react"
			+"React"
		}
		p {
			className = ClassName("my-code-name")
			+"20785C Website"
		}
		div {
			a {
				href = "https://github.com/PP6464/20785CWeb"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		div {
			a {
				href = "https://20785c.tech"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View website"
			}
		}
		p {
			className = ClassName("my-code-name")
			+"Hale Hamilton Employee Management System (Website) [Work Experience]"
		}
		div {
			a {
				href = "https://github.com/PP6464/hale-hamilton-employee-project"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		div {
			a {
				href = "https://hale-hamilton-employee-project.web.app"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View website"
			}
		}
		h3 {
			id = "flutter"
			+ "Flutter"
		}
		p {
			className = ClassName("my-code-name")
			+"Tetraconnect"
		}
		div {
			a {
				href = "https://github.com/PP6464/Tetraconnect"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "kmm"
			+"Kotlin Multiplatform Mobile"
		}
		p {
			+"(No code yet)"
		}
		h3 {
			id = "compose"
			+"Jetpack Compose"
		}
		p {
			className = ClassName("my-code-name")
			+"Commenter (Android app) [Work in progress]"
		}
		div {
			a {
				href = "https://github.com/PP6464/commenter-android"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "kotlin-dl"
			+"Kotlin DL"
		}
		p {
			className = ClassName("my-code-name")
			+"Kotlin FCNN"
		}
		div {
			a {
				href = "https://github.com/PP6464/KotlinNeuralNetwork"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "tensorflow"
			+"Tensorflow"
		}
		p {
			className = ClassName("my-code-name")
			+"Random List Checker"
		}
		div {
			a {
				href = "https://github.com/PP6464/RandomListChecker"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View on Github"
			}
		}
		p {
			className = ClassName("my-code-name")
			+"Face Recogniser"
		}
		div {
			a {
				href = "https://github.com/PP6464/FaceRecogniser"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "ktor"
			+"Ktor"
		}
		p {
			className = ClassName("my-code-name")
			+"Commenter (API) [Work in progress]"
		}
		div {
			a {
				href = "https://github.com/PP6464/commenter-backend"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "nest"
			+"Nest"
		}
		p {
			className = ClassName("my-code-name")
			+"Hale Hamilton Employee Management System (API) [Work Experience]"
		}
		div {
			a {
				href = "https://github.com/PP6464/hale-hamilton-employee-api"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "Mathematics"
			+"Mathematics"
		}
		p {
			className = ClassName("my-code-name")
			+"Julia FFT"
		}
		div {
			a {
				href = "https://github.com/PP6464/Julia-FFT"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		p {
			className = ClassName("my-code-name")
			+"Matrix exponentiator"
		}
		div {
			a {
				href = "http://github.com/PP6464/MatrixExponent"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "game-development"
			+"Game Development"
		}
		p {
			+"(No code yet)"
		}
		h3 {
			id = "assembly"
			+"Assembly"
		}
		p {
			className = ClassName("my-code-name")
			+"Celsius to Fahrenheit"
		}
		div {
			a {
				href = "https://github.com/PP6464/celsius_to_fahrenheit"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "computer-vision"
			+"Computer Vision"
		}
		p {
			className = ClassName("my-code-name")
			+"Face Recogniser"
		}
		div {
			a {
				href = "https://github.com/PP6464/FaceRecogniser"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "computer-graphics"
			+"Computer Graphics"
		}
		p {
			className = ClassName("my-code-name")
			+"Vector Field Visualiser"
		}
		div {
			a {
				href = "https://github.com/PP6464/VectorFieldVisualiser"
				target = WindowTarget._blank
				rel = "noreferrer"
				+"View code on Github"
			}
		}
		h3 {
			id = "arduino"
			+"Arduino"
		}
		p {
			+"(No code yet)"
		}
		p {
			style = jso {
				marginBottom = 10.px
			}
		}
	}
}