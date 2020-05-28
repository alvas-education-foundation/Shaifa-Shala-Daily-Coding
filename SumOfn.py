def digital_root(num):
    if(num<10):
        return num
    else:
        return digital_root((num%10)+digital_root(num//10))1
num=int(input('Enter the num '))
print(digital_root(num))
