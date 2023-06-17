import components.Navbar
import js.core.jso
import pages.*
import react.FC
import react.Props
import react.create
import web.dom.document
import react.dom.client.createRoot
import react.router.RouterProvider
import react.router.dom.createBrowserRouter

val appRouter = createBrowserRouter(
	arrayOf(
		jso {
			path = "/"
			element = Navbar.create()
			children = arrayOf(
				jso {
					index = true
					element = Home.create()
				},
				jso {
					path = "about-me"
					element = AboutMe.create()
				},
				jso {
					path = "areas-of-expertise"
					element = AreasOfExpertise.create()
				},
				jso {
					path = "frameworks"
					element = Frameworks.create()
				},
				jso {
					path = "what-i-am-exploring"
					element = WhatIAmExploring.create()
				},
				jso {
					path = "my-code"
					element = MyCode.create()
				},
				jso {
					element = NotFoundPage.create()
				}
			)
		}
	)
)

fun main() {
	val container = document.createElement("div").apply {
		id = "root"
	}
	document.body.appendChild(container)
	
	val app = FC<Props> {
		RouterProvider {
			router = appRouter
		}
	}
	createRoot(container).render(app.create())
}