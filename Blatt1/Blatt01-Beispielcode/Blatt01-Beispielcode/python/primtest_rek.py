import math
# Nummer aus Quelltext lesen
with open('number.txt', 'r') as f:
    expression = f.read().strip()
    numb = eval(expression)
# Testen, ob die Zahl eine Primzahl ist
def is_prime(number, i=2):
    if number < 2:
        return False
    elif i > math.floor(math.sqrt(number)):
        return True
    elif number % i == 0:
        return False
    else:
        return is_prime(number, i + 1)


if is_prime(numb):
    print(f"{numb} ist eine Primzahl")
else:
    print(f"{numb} ist keine Primzahl")