#include <stdio.h>

int main() {
    int a = 5, b = 10;
    // Swap using XOR bitwise logic
    a ^= b; b ^= a; a ^= b;
    printf("Swapped: a = %d, b = %d\n", a, b);
    return 0;
}