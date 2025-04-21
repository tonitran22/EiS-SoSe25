#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int number = 10007*100003;
    for (int i=2; i <= floor(sqrt(number)); i++) {
        if (number % i == 0) {
            cout << number << " is not prime" << endl;
            break;
        }
    }
}