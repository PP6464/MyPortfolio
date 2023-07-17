package pages

import js.core.jso
import kotlinx.browser.window
import mui.icons.material.ArrowOutward
import org.w3c.dom.SMOOTH
import org.w3c.dom.ScrollBehavior
import org.w3c.dom.ScrollToOptions
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.router.dom.Link
import react.router.useLocation
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
			+"Frameworks"
		}
		h1 {
			id = "web-development"
			className = ClassName("framework-starting-h1")
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
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#kotlin-react"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
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
				div {
					h1 {
						+"React"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#react"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
		h1 {
			id = "app-development"
			className = ClassName("framework-starting-h1")
			+"App development"
		}
		div {
			className = ClassName("section")
			style = jso {
				height = 5.px
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Flutter"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#flutter"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
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
				div {
					h1 {
						+"Kotlin Multiplatform Mobile"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#kmm"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
		h1 {
			id = "ai-development"
			className = ClassName("framework-starting-h1")
			+"AI development"
		}
		div {
			className = ClassName("section")
			style = jso {
				height = 5.px
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Kotlin DL"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#kotlin-dl"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
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
				div {
					h1 {
						+"Tensorflow"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#tensorflow"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/code-background.png"
				alt = ""
			}
		}
		h1 {
			id = "api-development"
			className = ClassName("framework-starting-h1")
			+"API development"
		}
		div {
			className = ClassName("section")
			style = jso {
				height = 5.px
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Ktor"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#ktor"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
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
				div {
					h1 {
						+"Nest"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have expertise in many areas of programming, and I am a full stack developer. I am able to develop both frontend and backend with many frameworks, making me a great fit into most projects."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#nest"
					+"View my code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
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