package pages

import js.core.jso
import mui.icons.material.ArrowOutward
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.router.dom.Link
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
			id = "web-development"
			className = ClassName("framework-type")
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
		}
		div {
			id = "app-development"
			className = ClassName("framework-type")
			h3 {
				style = jso {
					paddingBottom = 5.px
				}
				+"App development"
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
		}
		div {
			id = "ai-development"
			className = ClassName("framework-type")
			h3 {
				style = jso {
					paddingBottom = 5.px
				}
				+"AI development"
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
		}
		div {
			id = "api-development"
			className = ClassName("framework-type")
			h3 {
				style = jso {
					paddingBottom = 5.px
				}
				+"API development"
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
		}
	}
}