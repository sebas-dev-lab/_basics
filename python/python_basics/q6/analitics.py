def factorial(n):
    '''
        Factorial de un numero para el calculo de combitatoria
    '''
    if n == 0 or n == 1:
        return 1
    elif n > 1:
        return n*factorial(n-1)


def combinatoria(nums, ac):
    '''
        Calculo de combinatorias posibles
        nums: total de numeros posibles
        ac: numero aciertos
    '''
    return (factorial(nums)/(factorial(ac)*factorial(nums-ac)))


