package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.router.dom.Link
import react.useEffect
import web.cssom.*
import web.dom.document
import web.dom.observers.IntersectionObserver
import mui.icons.material.ArrowOutward

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
				div {
					h1 {
						+"Skills"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I am skilled in many areas of programming. I can develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/skills"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/skills.png"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Frameworks"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I am adept with many programming frameworks for both frontend and backend development, so I can fill many roles in many different projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/frameworks"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/frameworks.webp"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"What I'm exploring"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I am always looking to expand my skill set, to make me more suitable for more projects. I am currently looking to expand my capabilities in game development and low level programming as well as further enhancing my skills in my areas of expertise with new frameworks."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/what-i-am-exploring"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/what-i-am-exploring.png"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"My Code"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I believe in collaboration when it comes to programming, and so I use Github to host my code and collaborate with others. Please click below to view my code."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/my-code.png"
				alt = ""
			}
		}
	}
}