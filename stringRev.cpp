#include <iostream>
#include <algorithm> // For reverse()
#include <string>

int main() {
    std::string text = "Level Up";
    std::cout << "Original String:" << text << std::endl;
    std::reverse(text.begin(), text.end());
    std::cout << "Reversed: " << text << std::endl;
    return 0;
}
