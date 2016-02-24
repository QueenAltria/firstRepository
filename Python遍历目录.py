
import os
from time import sleep
b="E://±ÏÏò¶«"
fo = open("foo.txt", "wb")
for root,dirs,files in os.walk(b):
    for a in dirs:
        #print a
        fo.write(a)
        fo.write("\r\n")
    for i in files:
        #print i
        fo.write(i+"\r\n")


sleep(2)

