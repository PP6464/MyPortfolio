package components

import kotlinx.browser.window
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.dom.html.ReactHTML.img
import react.router.Outlet
import react.router.useLocation
import js.core.jso
import react.dom.html.ReactHTML.p
import web.cssom.*
import web.timers.setTimeout
import kotlin.time.Duration
import mui.icons.material.Email
import mui.icons.material.Phone

enum class Route(val route: String, val title: String) {
	HOME("/", "Home"),
	ABOUT_ME("/about-me", "About Me"),
	AREAS_OF_EXPERTISE("/areas-of-expertise", "Areas of expertise"),
	FRAMEWORKS("/frameworks", "Frameworks"),
	WHAT_I_AM_EXPLORING("/what-i-am-exploring", "What I'm exploring"),
	MY_CODE("/my-code", "My Code"),
	ERROR_NOT_FOUND("/404-error", "404");
	
	companion object {
		fun fromString(path: String): Route {
			return when (path) {
				HOME.route -> HOME
				ABOUT_ME.route -> ABOUT_ME
				AREAS_OF_EXPERTISE.route -> AREAS_OF_EXPERTISE
				FRAMEWORKS.route -> FRAMEWORKS
				WHAT_I_AM_EXPLORING.route -> WHAT_I_AM_EXPLORING
				MY_CODE.route -> MY_CODE
				else -> ERROR_NOT_FOUND
			}
		}
	}
}

val Navbar = FC<Props> {
	val (windowWidth, setWidth) = useState(window.innerWidth)
	val (index, setIndex) = useState(0)
	val (showSmallDiv, setShowSmallDiv) = useState(false)
	val (closing, setClosing) = useState(false)
	val location = useLocation()
	
	fun closeSmallDiv() {
		setShowSmallDiv(false)
		setClosing(true)
		setTimeout(delay = Duration.parse("0.5s"), callback = { setClosing(false) })
	}
	
	useEffect(location) {
		setIndex(Route.values().indexOf(Route.fromString(location.pathname)))
	} // Run whenever location changes
	
	useEffect {
		val windowResizeListener = { setWidth(window.innerWidth) }
		window.addEventListener("resize", { _ -> windowResizeListener() })
	} // Run whenever window resizes
	
	nav {
		className = if (windowWidth < 1000 && showSmallDiv) ClassName("showing-more") else null
		if (windowWidth < 1000) {
			div {
				id = "navbar-small-top"
				img {
					src = "/panth-pic.png"
					alt = ""
					style = jso {
						height = 10.vh
						width = 10.vh
						marginRight = 10.px
						border = Border(5.px, LineStyle.solid, NamedColor.black)
						borderRadius = 50.pct
					}
				}
				div {
					style = jso {
						display = Display.flex
						flexDirection = FlexDirection.column
						color = NamedColor.grey
					}
					h1 {
						style = jso {
							color = NamedColor.black
							width = 6.em
						}
						+"Panth Patel"
					}
					div {
						style = jso {
							display = Display.flex
							flexDirection = FlexDirection.row
						}
						Email {
							style = jso {
								height = 17.5.px
							}
						}
						p {
							style = jso {
								marginLeft = 2.px
								fontSize = 15.px
							}
							+"32ppatel@gmail.com"
						}
					}
					div {
						style = jso {
							display = Display.flex
							flexDirection = FlexDirection.row
						}
						Phone {
							style = jso {
								height = 17.5.px
							}
						}
						p {
							style = jso {
								marginLeft = 2.px
								fontSize = 15.px
							}
							+"+44 73058 21678"
						}
					}
				}
			}
			div {
				onClick = {
					if (showSmallDiv) { closeSmallDiv() } else setShowSmallDiv(true)
				}
				id = "navbar-small-bottom"
				h1 {
					+"More"
				}
				h1 {
					id = "navbar-more-icon"
					className = if (showSmallDiv) ClassName("showing-more") else null
					+">"
				}
			}
			ul {
				id = "navbar-small-ul"
				className = if (showSmallDiv) ClassName("showing-more") else if (closing) ClassName("closing") else null
				Route.values().filter { it != Route.ERROR_NOT_FOUND } .withIndex().map {
					NavbarOption {
						title = it.value.title
						route = it.value.route
						onClick = ::closeSmallDiv
						selected = it.index == index
					}
				}
			}
		} else {
			img {
				src = "/panth-pic.png"
				alt = ""
				style = jso {
					height = 15.vh
					width = 15.vh
					margin = 10.px
					border = Border(5.px, LineStyle.solid, NamedColor.black)
					borderRadius = 50.pct
				}
			}
			div {
				style = jso {
					display = Display.flex
					flexDirection = FlexDirection.column
					justifyContent = JustifyContent.center
					alignItems = AlignItems.flexStart
				}
				div {
					style = jso {
						display = Display.flex
						flexDirection = FlexDirection.column
						color = NamedColor.grey
					}
					h1 {
						style = jso {
							color = NamedColor.black
							width = 6.em
						}
						+"Panth Patel"
					}
					div {
						style = jso {
							display = Display.flex
							flexDirection = FlexDirection.row
						}
						Email {
							style = jso {
								height = 17.5.px
							}
						}
						p {
							style = jso {
								marginLeft = 2.px
								fontSize = 15.px
							}
							+"32ppatel@gmail.com"
						}
					}
					div {
						style = jso {
							display = Display.flex
							flexDirection = FlexDirection.row
						}
						Phone {
							style = jso {
								height = 17.5.px
							}
						}
						p {
							style = jso {
								marginLeft = 2.px
								fontSize = 15.px
							}
							+"+44 73058 21678"
						}
					}
				}
				div {
					ul {
						style = jso {
							display = Display.flex
							justifyContent = JustifyContent.center
							alignItems = AlignItems.center
							height = 100.pct
						}
						Route.values().filter { it != Route.ERROR_NOT_FOUND } .withIndex().map {
							NavbarOption {
								title = it.value.title
								route = it.value.route
								selected = it.index == index
							}
						}
					}
				}
			}
		}
	}
	div {
		id = "content"
		Outlet()
	}
}