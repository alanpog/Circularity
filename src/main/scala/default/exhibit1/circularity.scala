package default.exhibit1

trait C {val a: List[D]}

class D(implicit val c: C)

object ImplicitHolder {
	implicit object I extends C {
		val a = List(A) 
	}
}

import ImplicitHolder._

object A extends D {
	val b = c.a.head
	val s = "hello"
}

object Circularity extends App {
	println(I.a.head.s)
}
