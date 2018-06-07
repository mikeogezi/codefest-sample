#include <bits/stdc++.h>

using namespace std;

int main (int argc, char ** argv) {
    string line;
    while (getline(cin, line)) { // Get a single line from the input
        istringstream iss(line); // Convert the line into a stream
        long num = 0, sum = 0;
        while (iss >> num) { // Get all the integers in the stream
            sum += num; // Add integers to the sum
        }
        double output = sqrt(sum); // Compute the square root of the sum
        printf("%.4f\n", output); // Print the output
    }

    return EXIT_SUCCESS;
}