package pages

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul
import react.dom.html.ReactHTML.li
import react.router.dom.Link
import web.cssom.ClassName

val NotFoundPage = FC<Props> {
	div {
		className = ClassName("container")
		h1 {
			+"404: Page not found"
		}
		p {
			+"Try one of"
		}
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
} 