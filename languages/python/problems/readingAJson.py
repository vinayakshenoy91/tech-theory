f = open('fake_fruit.json', 'r')      # open the file for reading
print(f.read())                       # read and print the file content
f.close()                             # close the file

"""
Next, we are going to use the Python with statement to temporarily open the file and de-serialize 
the data into a Python dict. The with statement provides an exception-safe way to open and consume a resource 
without a traditional try / except / finally pattern. It also takes care of closing the file, 
so we no longer need an f.close() function call. See here for further details
"""
#Read and write

import json

with open('fake_fruit.json', 'r') as f:   # open the JSON file for reading
    data = json.load(f)                   # de-serialise the JSON to a dict

data['Fruit'][1]['Name'] = 'Wrong'        # write 'Wrong' to 'Name' field
    
with open ('fake_fruit.json', 'w') as f:   # open the JSON file for writing
    json.dump(data, f, indent=4)           # write JSON back to file          

with open('fake_fruit.json', 'r') as f:    # open one final time
    print(f.read())                        # print the new file contents