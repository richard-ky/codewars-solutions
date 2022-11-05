'''
basically what this does is combine consecutive repeated digits
66644319333 becomes [18][8]319[9]
1883199 becomes 1[16]31[18]
1163118 becomes [2]63[2]8
'''

numbers = "66644319333"
result = []
flag = True
curr = 0
while flag:
    count = 1
    for i in range(1, len(numbers)):
        curr = int(numbers[i])
        prev = int(numbers[i - 1])
        if curr == prev:
            count += 1
        else:
            result.append(prev * count)
            count = 1
    result.append(curr * count)
    numbers = ''.join(map(str, result))
    result = []
    flag = False
    for i in range(1, len(numbers)):
        if numbers[i] == numbers[i - 1]:
            flag = True
print(numbers)
