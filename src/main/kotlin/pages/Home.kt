package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import web.cssom.ClassName
import web.cssom.TextAlign

val Home = FC<Props> {
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
			+"Panth Patel"
		}
		p {
			style = jso {
				textAlign = TextAlign.center
			}
			+"I am a programmer with experience in many areas and frameworks"
		}
	}
}