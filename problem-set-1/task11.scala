def _compress(i: List[Char], o: List[Char]): List[Char] = (i, o) match {
  case (List(), List()) => List()
  case (hi::ti, ho::to) => if (hi == ho) _compress(ti, o) else _compress(ti, hi::o)
  case (hi::ti, List()) => _compress(ti, List(hi))
  case (hi::Nil, List()) => i
  case (List(), _) => o
  case _ => List()
}

def compress(list: List[Char]): List[Char] = _compress(list, List()).reverse


val list = List('a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

println(
  "compress(" + list + ") => " + compress(list)
)

