def pascal(r: Int, c: Int): Int = (r, c) match {
  case _ if c > r => throw new IllegalArgumentException
  case _ if r == c => 1
  case (_, 0) => 1
  case _ => pascal(r - 1, c - 1) + pascal(r - 1, c)
}

println
println("pascal(3, 1) => " + pascal(3, 1))
println("pascal(10, 3) => " + pascal(10, 3))
println("pascal(14, 7) => " + pascal(14, 7))
println("pascal(34, 14) => " + pascal(34, 14))

