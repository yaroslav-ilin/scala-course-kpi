import scala.math.sqrt

def isPrime(n: Int) = n % 2 != 0 && (3 to sqrt(n).toInt).forall(i => n % i != 0)

def nextPrime(p: Int): Int = if (isPrime(p)) p else nextPrime(p + 1)

def countPrimes(n: Int, p: Int): Int = {
  if (n % p == 0)
    1 + countPrimes(n / p, p)
  else
    0
}

def findPrimes(n: Int, p: Int): List[Tuple2[Int, Int]] = {
  if (p > n)
    Nil
  else if (n % p == 0)
    (p, countPrimes(n, p)) :: findPrimes(n / p, p + 1)
  else
    findPrimes(n, nextPrime(p + 1))
}

def primeFactors(n: Int) = findPrimes(n, 2)


println
println("primeFactors(315)  => " + primeFactors(315))

