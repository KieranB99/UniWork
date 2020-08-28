import random
turn = 0
randomnum = random.randint(1,200)
print ("Choose a number between 1 and 200")
print (randomnum)
answer = (int(input("Enter a number: ")))
while True:
    if answer != randomnum:
        newans = (int(input("Enter another number: ")))
    if newans > randomnum:
        print ("too high")
    else:
        print ("too low")
    if newans == randomnum:
        print ("Your turns = " +turn)
        break