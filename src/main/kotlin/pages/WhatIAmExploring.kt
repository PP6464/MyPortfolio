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
import web.cssom.*

val WhatIAmExploring = FC<Props> {
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
			+"What I'm exploring"
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
					+"View experimental code"
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
						+"Computer Vision"
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
					+"View experimental code"
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
						+"Angular"
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
					+"View experimental code"
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
						+"Arduino"
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
					+"View experimental code"
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