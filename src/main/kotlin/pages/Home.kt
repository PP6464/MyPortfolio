package pages

import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import web.cssom.ClassName

val Home = FC<Props> {
    div {
        className = ClassName("container")
        img {
            src = "/panth-pic.png"
            alt = ""
            id = "home-panth-pic"
        }
        h1 {
            +"Home"
        }
    }
}