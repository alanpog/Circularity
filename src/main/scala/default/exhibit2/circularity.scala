package default.exhibit2

trait C {val a: D}

class D(implicit val c: C)

object ImplicitHolder {
	implicit object I extends C {
		val a = A 
	}
}

import ImplicitHolder._

object A extends D {
	val b = c.a
	val s = "hello"
}

object Circularity extends App {
	println(I.a.s)
}
