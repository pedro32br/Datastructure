def factorial(i):
    if i <= 1:
        return i;
    else:
        return i * factorial(i - 1);


print(factorial(6));
