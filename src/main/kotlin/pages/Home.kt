package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.useEffect
import web.cssom.ClassName
import web.cssom.Padding
import web.cssom.TextAlign
import web.cssom.px
import web.dom.document
import web.dom.observers.IntersectionObserver

val Home = FC<Props> {
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
			+"Panth Patel"
		}
		p {
			style = jso {
				textAlign = TextAlign.center
				padding = Padding(0.px, 10.px, 5.px)
			}
			+"I am a self-taught programmer with experience in many areas and frameworks."
		}
		div {
			className = ClassName("section")
			div {
				h1 {
					+"Areas of expertise"
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				h1 {
					+"Frameworks"
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				h1 {
					+"What I'm exploring"
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				h1 {
					+"My Code"
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
	}
}