import math

while True:
    try:
        line = input() # Get a line of input
    except EOFError:
        break # Break the loop and end the program if the input is finished
    
    numbers = list(map(int, line.split())) # Convert numbers in input to a list of integers
    output = math.sqrt(sum(numbers)) # Calculate the square root of the sum of integers
    print("%.4f" % output) # Print out the result