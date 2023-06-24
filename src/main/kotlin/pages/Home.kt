package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
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
				p {
					+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
				}
				a {
					href = "/areas-of-expertise"
					+"Learn more"
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
				p {
					+"I am adept with many programming frameworks for both frontend and backend development, so I can fill many roles in many different projects."
				}
				a {
					href = "/frameworks"
					+"Learn more"
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
				p {
					+"I am always looking to expand my skill set, to make me more suitable for more projects. I am currently looking to expand my capabilities in game development and low level programming as well as further enhancing my skills in my areas of expertise with new frameworks."
				}
				a {
					href = "/what-i-am-exploring"
					+"Learn more"
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
				p {
					+"I believe in collaboration when it comes to programming, and so I use Github to host my code and collaborate with others. Please click below to view my code."
				}
				a {
					href = "/my-code"
					+"Learn more"
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
	}
}