package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.dom.html.ReactHTML.li
import react.router.Outlet
import react.router.dom.Link

val Navbar = FC<Props> {
    nav {
        ul {
            li {
                Link {
                    to = "."
                    +"Home"
                }
            }
            li {
                Link {
                    to = "about-me"
                    +"About Me"
                }
            }
            li {
                Link {
                    to = "areas-of-expertise"
                    +"Areas of expertise"
                }
            }
            li {
                Link {
                    to = "frameworks"
                    +"Frameworks"
                }
            }
            li {
                Link {
                    to = "what-i-am-exploring"
                    +"What I'm exploring"
                }
            }
            li {
                Link {
                    to = "my-code"
                    +"My code"
                }
            }
        }
    }
    Outlet()
}