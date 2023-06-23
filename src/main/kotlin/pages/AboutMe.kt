package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import web.cssom.ClassName
import web.cssom.TextAlign
import web.cssom.TextDecoration
import web.cssom.px
import web.window.WindowTarget
import mui.icons.material.LinkedIn as LinkedInIcon
import mui.icons.material.Phone as PhoneIcon
import mui.icons.material.Email as EmailIcon

val AboutMe = FC<Props> {
	val contactDetails = mapOf(
		"linkedIn" to "panth-patel-b92309214",
		"email" to "32ppatel@gmail.com",
		"phone" to "+44 73058 21678"
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
		h1 {
			+"About Me"
		}
		p {
			style = jso {
				textAlign = TextAlign.center
			}
			+"I am a self-taught programmer with experience using many different frameworks and I have experience with many different areas of programming, spanning web and app development to API and neural network development."
		}
		h3 {
			style = jso {
				textDecoration = TextDecoration.underline
			}
			+"Contact Me:"
		}
		contactDetails.map {
			div {
				className = ClassName("contact-detail")
				when (it.key) {
					"linkedIn" -> a {
						href = "https://www.linkedin.com/in/${it.value}"
						target = WindowTarget._blank
						rel = "noreferrer"
						LinkedInIcon {
							style = jso {
								height = 20.px
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
						EmailIcon {
							style = jso {
								height = 20.px
								paddingRight = 5.px
							}
						}
						p {
							+it.value
						}
					}
					"phone" -> {
						PhoneIcon {
							style = jso {
								height = 20.px
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
