import math
number = 10007*100003
i = 2
# Testen, ob die Zahl eine Primzahl ist
while i <= math.floor(math.sqrt(number)):
    if number % i == 0:
        print(f"{number} is not prime")
        break
    i += 1
else:
    print(f"{number} is prime")
