#
#!=========== Python Basics exercises ==========#
#? plus/minus/multiply

print('Basics calculator: Only you can enter a number data type: 2 numbers only')
type_op=input('Enter: "+" for plus; "-" for minus; "/" for division; "*" for multiply: ')
num_1=int(input('Enter the first number: '))
num_2=int(input('Enter the second number: '))

if type_op == '+':
    print(num_1+num_2)
elif type_op == '-':
    if num_1 > num_2:
        print(num_1-num_2)
    else:
        print(num_2-num_1)
elif type_op == '/':
    print(num_1/num_2)
elif type_op == '*':
    print(num_1*num_2)
else:
    print('Error')
