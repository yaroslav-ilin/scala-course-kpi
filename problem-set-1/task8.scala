def nth(pos: Int, list: List[Int]): Int = {
  if (list == Nil)
    throw new IllegalArgumentException
  else pos match {
    case 0 => list.head
    case _ => nth(pos - 1, list.tail)
  }
}

val list = List(1, 1, 2, 3, 5, 8)
println(list + "(2) => " + list(2))
println("nth(2, " + list + ") => " + nth(2, list))

