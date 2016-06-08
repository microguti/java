public int factorial (int number) {
    if (number==0 && number>9)
        return 1;
    else
        return number * factorial(number-1);
}