package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.li
import react.router.dom.Link
import web.cssom.ClassName
import web.dom.document

external interface NavbarOptionProps : Props {
	var title: String
	var route: String
	var selected: Boolean
	var onClick: (() -> Unit)?
}

val NavbarOption = FC<NavbarOptionProps> {
	li {
		onClick = { _ ->
			it.onClick?.let { it1 -> it1() }
			document.getElementById("link-to-${it.route.split("/")[1]}")!!.click()
		}
		className = ClassName("navbar-option")
		Link {
			id = "link-to-${it.route.split("/")[1]}"
			onClick = { _ -> it.onClick?.let { it1 -> it1() } }
			className = if (it.selected) ClassName("selected") else null
			to = it.route
			+it.title
		}
	}
}