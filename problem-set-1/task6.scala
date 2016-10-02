def balance(chars: List[Char]): Boolean = {
  def balanced(chars: List[Char], count: Int): Boolean = chars match {
    case Nil => count == 0
    case _ if chars.head == '(' => balanced(chars.tail, count + 1)
    case _ if chars.head == ')' => count > 0 && balanced(chars.tail, count - 1)
    case _ => balanced(chars.tail, count)
  }
  balanced(chars, 0)
}

println("balance(\"(if (zero? x) max(/1 x))\") => " + balance("(if (zero? x) max(/1 x))".toList))
println("balance(\":-)\") => " + balance(":-)".toList))

