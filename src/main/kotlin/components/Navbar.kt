package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.dom.html.ReactHTML.li
import react.router.Outlet
import react.router.dom.Link
import react.router.useLocation
import react.useEffect
import react.useState
import web.cssom.ClassName

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
    val (index, setIndex) = useState(0)
    val location = useLocation()

    useEffect(location) {
        setIndex(Route.values().indexOf(Route.fromString(location.pathname)))
    }

    nav {
        h1 {
            +"Panth Patel"
        }
        ul {
            li {
                Link {
                    className = if (index == 0) ClassName("data-selected") else null
                    to = "."
                    +"Home"
                }
            }
            li {
                Link {
                    className = if (index == 1) ClassName("data-selected") else null
                    to = "about-me"
                    +"About Me"
                }
            }
            li {
                Link {
                    className = if (index == 2) ClassName("data-selected") else null
                    to = "areas-of-expertise"
                    +"Areas of expertise"
                }
            }
            li {
                Link {
                    className = if (index == 3) ClassName("data-selected") else null
                    to = "frameworks"
                    +"Frameworks"
                }
            }
            li {
                Link {
                    className = if (index == 4) ClassName("data-selected") else null
                    to = "what-i-am-exploring"
                    +"What I'm exploring"
                }
            }
            li {
                Link {
                    className = if (index == 5) ClassName("data-selected") else null
                    to = "my-code"
                    +"My code"
                }
            }
        }
    }
    Outlet()
}