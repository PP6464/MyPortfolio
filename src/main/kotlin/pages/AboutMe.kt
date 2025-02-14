package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import web.cssom.*
import web.window.WindowTarget
import mui.icons.material.LinkedIn
import mui.icons.material.Phone
import mui.icons.material.Email
import mui.icons.material.GitHub

val AboutMe = FC<Props> {
	val contactDetails = mapOf(
		"linkedIn" to "panth-patel-b92309214",
		"github" to "PP6464",
		"email" to "32ppatel@gmail.com",
		"phone" to "+44 73058 21678",
	)
	
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
		div {
			id = "about-me-root"
			div {
				h1 {
					+"About Me"
				}
				p {
					id = "about-me-text"
					+"I am a self-taught programmer with experience using many different frameworks and I have experience with many different areas of programming, spanning web and app development to API and neural network development."
				}
			}
			div {
				h1 {
					style = jso {
						marginBottom = 10.px
					}
					+"Contact Me"
				}
				contactDetails.map {
					div {
						className = ClassName("contact-detail")
						when (it.key) {
							"linkedIn" -> a {
								href = "https://www.linkedin.com/in/${it.value}"
								target = WindowTarget._blank
								rel = "noreferrer"
								LinkedIn {
									style = jso {
										height = 30.px
										paddingRight = 5.px
									}
								}
								p {
									+"Panth Patel"
								}
							}
							
							"email" -> a {
								href = "mailto:${it.value}"
								target = WindowTarget._blank
								rel = "noreferrer"
								Email {
									style = jso {
										height = 30.px
										paddingRight = 5.px
									}
								}
								p {
									+it.value
								}
							}
							
							"phone" -> a {
								href = "tel:${it.value.replace(" ", "-")}"
								target = WindowTarget._blank
								rel = "noreferrer"
								Phone {
									style = jso {
										height = 30.px
										paddingRight = 5.px
									}
								}
								p {
									+it.value
								}
							}

							"github" -> a {
								href = "https://github.com/PP6464/"
								target = WindowTarget._blank
								rel = "noreferrer"
								GitHub {
									style = jso {
										height = 30.px
										paddingRight = 5.px
									}
								}
								p {
									+it.value
								}
							}
						}
					}
				}
			}
		}
	}
}
