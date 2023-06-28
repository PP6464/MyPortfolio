package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import react.router.dom.Link
import web.cssom.*
import mui.icons.material.ArrowOutward
import react.useEffect
import web.dom.document
import web.dom.observers.IntersectionObserver

val AreasOfExpertise = FC<Props> {
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
			+"Areas of expertise"
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
						+"Web development"
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
					to = "/frameworks#web-development"
					+"Learn more"
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
						+"App development"
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
					to = "/frameworks#app-development"
					+"Learn more"
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
						+"AI development"
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
					to = "/frameworks#ai-development"
					+"Learn more"
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
						+"API development"
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
					to = "/frameworks#api-development"
					+"Learn more"
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
