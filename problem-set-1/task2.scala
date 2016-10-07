def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n)
def isCoprime(m: Int, n: Int): Boolean = gcd(m, n) == 1

println
println("isCoprime(7, 11) => " + isCoprime(7, 11))
println("isCoprime(15, 25) => " + isCoprime(15, 25))

