def add_two_numbers() -> int:
    inputstr = input()
    input_list = inputstr.split(',')
    input_list1 = list(map(int,input_list))
    return sum(input_list1)


# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
