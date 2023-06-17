package components

import kotlinx.browser.window
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.img
import react.router.Outlet
import react.router.dom.Link
import react.router.useLocation
import js.core.jso
import web.cssom.*

enum class Route(private val route: String) {
	HOME("/"),
	ABOUT_ME("/about-me"),
	AREAS_OF_EXPERTISE("/areas-of-expertise"),
	FRAMEWORKS("/frameworks"),
	WHAT_I_AM_EXPLORING("/what-i-am-exploring"),
	MY_CODE("/my-code"),
	ERROR_NOT_FOUND("/404-error");
	
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
	val (windowWidth, setWidth) = useState(0)
	val (index, setIndex) = useState(0)
	val location = useLocation()
	
	fun debounce(`fun`: () -> Unit): () -> Unit {
		var timerId: Int = -1
		return {
			window.clearTimeout(timerId)
			timerId = window.setTimeout(timeout = 1000, handler = {
				`fun`()
			})
		}
	}
	
	useEffect(location) {
		setIndex(Route.values().indexOf(Route.fromString(location.pathname)))
	} // Run whenever location changes
	
	useEffect {
		val windowResizeListener = debounce {
			setWidth(window.innerWidth)
		}
		window.addEventListener("resize", { _ -> windowResizeListener() })
	}
	
	nav {
		if (windowWidth < 790) {
			div {
				id = "navbar-small-top"
				img {
					src = "/panth-pic.png"
					alt = ""
					style = jso {
						height = 10.vh
						width = 10.vh
						marginRight = 10.px
					}
				}
				h1 {
					+"Panth Patel"
				}
			}
			div {
				id = "navbar-small-bottom"
				h1 {
					+"More"
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
				}
			}
			div {
				style = jso {
					display = Display.flex
					flexDirection = FlexDirection.column
					justifyContent = JustifyContent.center
					alignItems = AlignItems.flexStart
				}
				h1 {
					+"Panth Patel"
				}
				h1 {
					+"<Content>"
				}
			}
		}
	}
	div {
		id = "content"
		Outlet()
	}
}