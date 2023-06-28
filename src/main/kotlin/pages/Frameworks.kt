package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.useEffect
import web.cssom.*
import web.dom.document
import web.dom.observers.IntersectionObserver

val Frameworks = FC<Props> {
	val observer = IntersectionObserver(callback = { entries, _ ->
		entries.map {
			if (it.isIntersecting) {
				it.target.classList.add("visible")
			} else {
				it.target.classList.remove("visible")
			}
		}
	})
	
	useEffect {
		val sections = document.querySelectorAll(".section")
		sections.forEach(observer::observe)
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
			+"Frameworks"
		}
		div {
			className = ClassName("framework-type")
			id = "web-development"
			h3 {
				style = jso {
					paddingBottom = 5.px
				}
				+"Web development"
			}
			div {
				className = ClassName("section")
				div {
					div {
						h1 {
							+"Kotlin React"
						}
						p {
							style = jso {
								paddingBottom = 45.px
							}
							+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
						}
					}
				}
				img {
					src = "/code-background.png"
					alt = ""
				}
			}
		}
	}
}