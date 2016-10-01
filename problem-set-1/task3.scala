import scala.math.sqrt
def isPrime(n: Int) = n % 2 != 0 && (3 to sqrt(n).toInt).forall(i => n % i != 0)

println("isPrime(7) => " + isPrime(7))
println("isPrime(9) => " + isPrime(9))
println("isPrime(2147483646) => " + isPrime(2147483646))
println("isPrime(" + Int.MaxValue + ") => " + isPrime(Int.MaxValue))

