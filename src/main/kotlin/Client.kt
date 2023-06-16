import js.core.jso
import react.FC
import react.Props
import react.create
import web.dom.document
import react.dom.client.createRoot
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.router.Outlet
import react.router.RouterProvider
import react.router.dom.Link
import react.router.dom.createBrowserRouter

val Root = FC<Props> {
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
                    to = "/about"
                    +"About"
                }
            }
        }
    }
    Outlet()
}

val Home = FC<Props> {
    h1 {
        +"Home"
    }
}

val About = FC<Props> {
    h1 {
        +"About"
    }
}

val appRouter = createBrowserRouter(
    arrayOf(
        jso {
            path = "/"
            element = Root.create()
            children = arrayOf(
                jso {
                    index = true
                    element = Home.create()
                },
                jso {
                    path = "about"
                    element = About.create()
                }
            )
        }
    )
)

fun main() {
    val container = document.createElement("div")
    document.body.appendChild(container)

    val app = FC<Props> {
        RouterProvider {
            router = appRouter
        }
    }
    createRoot(container).render(app.create())
}