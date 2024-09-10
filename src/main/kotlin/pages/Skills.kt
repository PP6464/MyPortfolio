package pages

import js.core.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import react.router.dom.Link
import web.cssom.*
import mui.icons.material.ArrowOutward
import react.useEffect
import web.dom.document
import web.dom.observers.IntersectionObserver

val Skills = FC<Props> {
	val observer = IntersectionObserver(callback = { entries, _ ->
		entries.map {
			if (it.isIntersecting) {
				it.target.classList.add("visible")
			} else {
				it.target.classList.remove("visible")
			}
		}
	})
	
	useEffect {
		val sections = document.querySelectorAll(".section")
		sections.forEach(observer::observe)
	}
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
			+"Skills"
		}
		div {
			className = ClassName("section")
			style = jso {
				height = 5.px
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Web development"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have great ability in web development, already having developed a few websites for other people. I can develop an aesthetically pleasing frontend and integrate it with a backend seamlessly."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/frameworks#web-development"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/web-dev.jpg"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"App development"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"App development is one of my favourite areas of programming. I have already developed apps and am continuing to improve my skills with new frameworks such as KMM."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/frameworks#app-development"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/app-dev.jpg"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"AI development"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have an interest in developing AI to further expand my capabilities as a full stack developer, by developing and deploying AI models, which I can use in apps, websites and APIs."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/frameworks#ai-development"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/ai-dev.jpeg"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"API development"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I am able to develop RESTful APIs quickly and in a manner that is maintainable, thus producing immaculate and organised APIs. I am looking to further enhance my skills in this area by learning about GraphQL APIs."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/frameworks#api-development"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/api-dev.png"
				alt = ""
			}
		}
		div {
			className = ClassName("section")
			div {
				div {
					h1 {
						+"Mathematics"
					}
					p {
						style = jso {
							paddingBottom = 45.px
						}
						+"I have a keen interest and great aptitude in mathematics, which is very important for grasping the key concepts of machine learning. I particularly enjoy calculus and I also enjoy engaging in complex problems (pun intended), but I still enjoy all parts of maths."
					}
				}
				Link {
					style = jso {
						display = Display.flex
						alignItems = AlignItems.center
						justifyContent = JustifyContent.center
						fontSize = 15.px
					}
					to = "/frameworks#mathematics"
					+"Learn more"
					ArrowOutward {
						style = jso {
							height = 17.5.px
						}
					}
				}
			}
			img {
				src = "/mathematics-skills.jpg"
				alt = ""
			}
		}
	}
}
