while True:
    try:
        word = raw_input()
    except EOFError:
        break

    length = len(word)
    i = 0 # First index of word
    j = length - 1 # Last index of word

    while i < length and j >= 0:
        # If the letters at indices i and j are not equal then it can't be a palindrome 
        if word[i] != word[j]:
            print("No")
            break

        # If the letters at indices i and j have been equal till the end then it's a palindrome
        if j == 0:
            print("Yes")

        i += 1 # Move i index forward
        j -= 1 # Move j index backward