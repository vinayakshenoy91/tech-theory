def reverse(items):
       x=''
       for i in range(len(items)-1,-1,-1):
                x+=items[i]
       return x

reverse('Hello')


#Using class

class StringWrapper:
    def __init__(self, string):
         self.input = string
         self.length = len(string)
    def reversed(self):
        output = ""
        for index in range(self.length, 0, -1):  
            output += self.input[index-1] 
        return output