import scala.math.sqrt

def isPrime(n: Int) = n % 2 != 0 && (3 to sqrt(n).toInt).forall(i => n % i != 0)

def nextPrime(p: Int): Int =
  if (isPrime(p))
    p
  else
    nextPrime(p + 1)

def findPrimes(n: Int, p: Int): List[Int] =
  if (n % p == 0)
    p :: findPrimes(n / p, p)
  else if (p + 1 >= n)
    Nil
  else
    findPrimes(n, nextPrime(p + 1))

def primeFactors(n: Int) = findPrimes(n, 2)


println("primeFactors(315)  => " + primeFactors(315))

