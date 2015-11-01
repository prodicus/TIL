#!/usr/bin/env python3.4

import cgi, cgitb
cgitb.enable()

form = cgi.FieldStorage()
name = form.getvalue('username')

print("Content-type:text/html\r\n\r\n")
print("<html>")
print("<head><title>Checking of user list</title></head>")
print("<body>")
print("<h1>Checking whether the user exists:</h1>")
print("")


## now to cross check this username with the list of users in the file `userlist.txt`
## reading the file

file_path = "/home/tasdik/Dropbox/dabble/python/cgi/usr/usrlist.txt"

with open(file_path) as ffile:
    file_content = [f.rstrip() for f in ffile]

print("<p>Contents of the file :" + str(file_content))

print("<br><p>Data you entered : <b>" + name + "</b></p><br>")

if name in file_content:
    print("<p>The user : <b>" + name  + "</b> exists</p>")

else: 
    print("<p>The user : <b>" + name  + "</b> does not exist</p>")

print("</body>")
print("</html>")
print("")
print("")