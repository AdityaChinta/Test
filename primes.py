# A "one-liner" to find primes up to 50
primes = [x for x in range(2, 51) if all(x % y != 0 for y in range(2, int(x**0.5) + 1))]
print(f"Cool Primes: {primes}")