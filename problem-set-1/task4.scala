import scala.math.sqrt
def isPrime(n: Int) = n % 2 != 0 && (3 to sqrt(n).toInt).forall(i => n % i != 0)
def listPrimesInRange(r: Range) = (for (p <- r if isPrime(p)) yield p).to[List]

println("listPrimesInRange(7 to 31) => " + listPrimesInRange(7 to 31))
println("listPrimesInRange(1979 to 2017) => " + listPrimesInRange(1979 to 2017))

