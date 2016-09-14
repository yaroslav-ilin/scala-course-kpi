def not(a: Boolean) = a match {
  case true => false
  case false => true
}
println("not (false) => " + not(false) )

def and(a: Boolean, b: Boolean) = (a, b) match {
  case (true, true) => true
  case (_, _) => false
}
println("and (false, true) => " + and(false, true) )

def or(a: Boolean, b: Boolean) = (a, b) match {
  case (false, false) => false
  case _ => true
}
println("or (false, true) => " + or(false, true) )

def xor(a: Boolean, b: Boolean) = (a, b) match {
  case (true, false)|(false, true) => true
  case _ => false
}
println("xor (false, true) => " + xor(false, true) )

def nor(a: Boolean, b: Boolean) = (a, b) match {
  case (false, false) => true
  case _ => false
}
println("nor (false, true) => " + nor(false, true) )

def nand(a: Boolean, b: Boolean) = (a, b) match {
  case (true, true) => false
  case (_, _) => true
}
println("nand (true, true) => " + nand (true, true) )


def table(f: (Boolean, Boolean) => Boolean) = {
  val l = List(true, false)
  for (a <- l; b <- l) println("  " + a + "  " + b + "  " + f(a, b))
}

println
println("table(and):")
table(and)

