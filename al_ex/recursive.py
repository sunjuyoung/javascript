def recursive_function(i:int):
    if i == 20:
        return
    print(i,'번째')
    recursive_function(i+1)



recursive_function(1)

#반복적으로 구현한 n!
def factorial_iterative(n:int)->int:
    result =1
    for i in range(1,n+1):
        result *=i
    return result



print(factorial_iterative(4))


def factorial(n):
    if n <=1:
        return 1
    
    return n* factorial(n-1)


print(factorial(4))

#최대공약수 유클리호제법
def ucli(n1,n2):
    if n2 == 0:
        return n1

    a1= n1 % n2
    return ucli(n2,a1)


print(ucli(192,162))