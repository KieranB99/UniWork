#BDO Potato calculator
def calc():
    print ("Enter the amount of cereals")
    pot = (int(input()))
    newpot = pot / 5
    la = newpot * 2
    mw = newpot * 6
    sg = newpot
    wb = newpot / 500
    if wb == 0:
        wb = 1
    print ('You can make ', newpot, 'Beer')
    print ("Leaving agent - ", la)
    print ("Mineral Water - ", mw)
    print ("Sugar - ", sg)
    print ("Work Tables needed - ", wb)
calc()
input()

    
