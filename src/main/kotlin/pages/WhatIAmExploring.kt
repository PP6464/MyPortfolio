package pages

import js.core.jso
import mui.icons.material.ArrowOutward
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

val WhatIAmExploring = FC<Props> {
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
			style = jso {
				marginBottom = 5.px
			}
			+"What I'm exploring"
		}
		div {
			className = ClassName("section")
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Game development"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"Game development ties together many aspects of programming that I love, e.g. from low-level computation, e.g., running code on GPUs to the mathematics behind physics engines in games and front-end design to make the game more enjoyable."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#game-development"
					+"View experimental code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/game-dev.jpeg"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Computer Vision"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"In conjunction with ML, computer vision opens the doors to many different possibilities, e.g., face recognition software built into CCTV cameras, as well as self-driving vehicles."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#computer-vision"
					+"View experimental code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/computer-vision.jpeg"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Arduino"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"Because it is able to control hardware, e.g. LED lights, directly, Arduino is a very interesting and exciting framework for me to learn, and it creates endless different possibilites for what can be done by programming."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/my-code#arduino"
					+"View experimental code"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/arduino.jpeg"
				alt = ""
			}
		}
	}
}