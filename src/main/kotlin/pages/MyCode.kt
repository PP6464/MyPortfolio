package pages

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
			+"Kotlin React"
		}
		p {
			+"My portfolio (this website)"
		}
		a {
			href = "https://github.com/PP6464/MyPortfolio"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "react"
			+"React"
		}
		p {
			+"20785C Website"
		}
		a {
			href = "https://github.com/PP6464/20785CWeb"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		a {
			href = "https://20785c.tech"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View website"
		}
		p {
			+"Hale Hamilton Employee Management System (Website) [Work Experience]"
		}
		a {
			href = "https://github.com/PP6464/hale-hamilton-employee-project"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		a {
			href = "https://hale-hamilton-employee-project.web.app"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View website"
		}
		h3 {
			id = "flutter"
			+ "Flutter"
		}
		p {
			+"Commenter (App) [Work in progress]"
		}
		a {
			href = "https://github.com/PP6464/commenter-app"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		p {
			+"Mercury (App) [Work in progress]"
		}
		a {
			href = "https://github.com/PP6464/mercury-app"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "kmm"
			+"Kotlin Multiplatform Mobile"
		}
		p {
			+"Marsbazaar (KMM app)"
		}
		a {
			href = "https://github.com/PP6464/marsbazaar-kmm"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "kotlin-dl"
			+"Kotlin DL"
		}
		p {
			+"My First Neural Network"
		}
		a {
			href = "https://github.com/PP6464/KotlinNeuralNetwork"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "tensorflow"
			+"Tensorflow"
		}
		h3 {
			id = "ktor"
			+"Ktor"
		}
		p {
			+"Encode API"
		}
		a {
			href = "https://github.com/PP6464/EncodeAPI"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "nest"
			+"Nest"
		}
		p {
			+"Mercury (API) [Work in progress]"
		}
		a {
			href = "https://github.com/PP6464/mercury-api"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		p {
			+"Hale Hamilton Employee Management System (API) [Work Experience]"
		}
		a {
			href = "https://github.com/PP6464/hale-hamilton-employee-api"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "game-development"
			+"Game Development (Experimental)"
		}
		p {
			+"Race3D [Work in progress]"
		}
		a {
			href = "https://github.com/PP6464/Race3D"
			target = WindowTarget._blank
			rel = "noreferrer"
			+"View code on Github"
		}
		h3 {
			id = "computer-vision"
			+"Computer Vision"
		}
		h3 {
			id = "angular"
			+"Angular"
		}
		h3 {
			id = "arduino"
			+"Arduino"
		}
	}
}