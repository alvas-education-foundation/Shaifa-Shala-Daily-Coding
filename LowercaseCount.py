#Python Program to Count Number of Lowercase Characters in a string 
string=input('Enter string:')
c=0
for letter in string:
if letter.islower():
c+=1
print('The num of lowercased letters are:',c)
