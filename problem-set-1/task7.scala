def last(list: List[Int]): Int = list match {
  case Nil => throw new IllegalArgumentException
  case x :: Nil => x
  case _ => last(list.tail)
}

println
val list = List(1, 1, 2, 3, 5, 8)
println(list + ".last  => " + list.last)
println("last(" + list + ") => " + last(list))

