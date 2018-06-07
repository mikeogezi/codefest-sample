#include <bits/stdc++.h>

using namespace std;

int main () {
    string word;
    while (getline(cin, word)) {
        int len = word.size();
        // Index i starts from the beginning of the word while j starts from the end
        // We add 1 to i and subtract 1 from j at the end of every iteration of the loop    
        for (int i = 0, j = len - 1; i < len && j >= 0; ++i, --j) {
            // If the letters at indices i and j are not equal then it can't be a palindrome 
            if (word.at(i) != word.at(j)) {
                cout << "No" << endl;
                break;
            }
            // If the letters at indices i and j have been equal till the end then it's a palindrome
            if (j == 0) {
                cout << "Yes" << endl;
            }
        }
    }

    return EXIT_SUCCESS;
}