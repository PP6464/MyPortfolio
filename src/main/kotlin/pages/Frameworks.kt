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
						+"As I am very competent in both Kotlin and React, being able to achieve great feats with both, I am able to naturally produce very beautiful web apps with Kotlin react, such as this portfolio"
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
						+"Through my use of Kotlin-React, I have also built a great understanding of React, and have used it to build dynamic and elegant websites."
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
						+"I have achieved a lot with Flutter, making multiplayer games and chat apps using the framework, which simplifies and streamlines app development."
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
						+"I am very proficient in Kotlin, and this has let me use Kotlin Multiplatform Mobile to develop very elegant apps that use native widgets to feel more at home with the user's OS, whether that be iOS or Android, as well as using native backend APIs."
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
						+"KotlinDL is a framework I enjoy and excel in using, due to it letting me access the powers of deep learning on device with KotlinDL for Android, as well as because it is written in Kotlin, which I excel in, and so am easily able to use"
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
						+"Tensorflow is a framework used the world over to develop many thousands of deep learning models, and through my use of Tensorflow, I have become much more proficient and confident in it."
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
						+"Ktor is a framework I excel in using because I am very proficient in Kotlin, as well as understanding REST API architecture, letting me take full advantage of Ktor's plentiful features."
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
						+"Nest is a framework I excel in due to my understanding of API design, as well as my high proficiency in TypeScript, which lets me be able to naturally use this framework to design very robust APIs."
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
		h1 {
			id = "mathematics"
			className = ClassName("framework-starting-h1")
			+"Mathematics"
		}
		div { className = ClassName("section") }
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Julia"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"Although more of a language than a framework, I still excel in using Julia to develop very efficient algorithms, inspired by a lot of cutting-edge mathematics, such as the Fast Fourier Transform, which I have written an implementation of."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#mathematics"
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
						+"Sympy"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"Sympy is a Python framework I excel in due to having a very strong mathematical foundation, which is exactly what Sympy is based off. It lets me use numeric computation to solve many mathematical problems through efficient computation."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#mathematics"
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