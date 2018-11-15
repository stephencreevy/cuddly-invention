import random
secretNumber = random.randint(1, 20)
def getAnswer(answerNumber):
        if answerNumber == 1:
                return 'Bulbasaur'
        elif answerNumber == 2:
                return 'Ivysaur'
        elif answerNumber == 3:
                return 'Venusaur'
        elif answerNumber == 4:
                return 'Charmander'
        elif answerNumber == 5:
                return 'Charmeleon'
        elif answerNumber == 6:
                return 'Charizard'
        elif answerNumber == 7:
                return 'Squirtle'
        elif answerNumber == 8:
                return 'Wartortle'
        elif answerNumber == 9:
                return 'Blastoise'
        elif answerNumber == 10:
                return 'Caterpie'
        elif answerNumber == 11:
                return 'Metapod'
        elif answerNumber == 12:
                return 'Butterfree'
        elif answerNumber == 13:
                return 'Weedle'
        elif answerNumber == 14:
                return 'Kakuna'
        elif answerNumber == 15:
                return 'Beedrill'
        elif answerNumber == 16:
                return 'Pidgey'
        elif answerNumber == 17:
                return 'Pidgeotto'
        elif answerNumber == 18:
                return 'Pidgeot'
        elif answerNumber == 19:
                return 'Rattata'
        elif answerNumber == 20:
                return 'Raticate'
        elif answerNumber == 21:
                return 'Spearow'
        elif answerNumber == 22:
                return 'Fearow'
        elif answerNumber == 23:
                return 'Ekans'
        elif answerNumber == 24:
                return 'Arbok'
        elif answerNumber == 25:
                return 'Pikachu'
        elif answerNumber == 26:
                return 'Raichu'
        elif answerNumber == 27:
                return 'Sandshrew'
        elif answerNumber == 28:
                return 'Sandslash'
        elif answerNumber == 29:
                return 'Nidoran♀'
        elif answerNumber == 30:
                return 'Nidorina'
        elif answerNumber == 31:
                return 'Nidoqueen'
        elif answerNumber == 32:
                return 'Nidoran♂'
        elif answerNumber == 33:
                return 'Nidorino'
        elif answerNumber == 34:
                return 'Nidoking'
        elif answerNumber == 35:
                return 'Clefairy'
        elif answerNumber == 36:
                return 'Clefable'
        elif answerNumber == 37:
                return 'Vulpix'
        elif answerNumber == 38:
                return 'Ninetales'
        elif answerNumber == 39:
                return 'Jigglypuff♀'
        elif answerNumber == 40:
                return 'Wigglytuff'
        elif answerNumber == 41:
                return 'Zubat'
        elif answerNumber == 42:
                return 'Golbat'
        elif answerNumber == 43:
                return 'Oddish'
        elif answerNumber == 44:
                return 'Gloom'
        elif answerNumber == 45:
                return 'Vileplume'
        elif answerNumber == 46:
                return 'Paras'
        elif answerNumber == 47:
                return 'Parasect'
        elif answerNumber == 48:
                return 'Venonat'
        elif answerNumber == 49:
                return 'Venomoth'
        elif answerNumber == 50:
                return 'Diglett'
        elif answerNumber == 51:
                return 'Dugtrio'
        elif answerNumber == 52:
                return 'Meowth'
        elif answerNumber == 53:
                return 'Persian'
        elif answerNumber == 54:
                return 'Psyduck'
        elif answerNumber == 55:
                return 'Golduck'
        elif answerNumber == 56:
                return 'Mankey'
        elif answerNumber == 57:
                return 'Primeape'
        elif answerNumber == 58:
                return 'Growlithe'
        elif answerNumber == 59:
                return 'Arcanine'
        elif answerNumber == 60:
                return 'Poliwag'
        elif answerNumber == 61:
                return 'Poliwhirl'
        elif answerNumber == 62:
                return 'Poliwrath'
        elif answerNumber == 63:
                return 'Abra'
        elif answerNumber == 64:
                return 'Kadabra'
        elif answerNumber == 65:
                return 'Alakazam'
        elif answerNumber == 66:
                return 'Machop'
        elif answerNumber == 67:
                return 'Machoke'
        elif answerNumber == 68:
                return 'Machamp'
        elif answerNumber == 69:
                return 'Bellsprout'
        elif answerNumber == 70:
                return 'Weepinbell'
        elif answerNumber == 71:
                return 'Victreebel'
        elif answerNumber == 72:
                return 'Tentacool'
        elif answerNumber == 73:
                return 'Tentacruel'
        elif answerNumber == 74:
                return 'Geodude'
        elif answerNumber == 75:
                return 'Graveler'
        elif answerNumber == 76:
                return 'Golem'
        elif answerNumber == 77:
                return 'Ponyta'
        elif answerNumber == 78:
                return 'Rapidash'
        elif answerNumber == 79:
                return 'Slowpoke'
        elif answerNumber == 80:
                return 'Slowbro'
r = random.randint(1, 80)
print('Oh!... What is this?.....')
print('.....woah!')
print('A wild pokemon appeared out of nowhere!')
print('Its a ....')
pokemon = getAnswer(r)
print(pokemon)

print('Do you want to try and catch it? Y/N')
catch = str(input())
if catch == 'Y':
        print('I am thinking of a number between 1 and 20.')
        print('Guess it in 6 or less attempts and ' + pokemon +' Is all yours!')
elif catch == 'N':
        print('You fled.... and got away safely')
for guessesTaken in range(1, 7):
    print('Take a guess.')
    guess = int(input())
    if guess < secretNumber:
        print('Your guess is too low.')
    elif guess > secretNumber:
        print('Your guess is too high.')
    else:
        break
if guess == secretNumber:
    print('Good job! You guessed my number in ' + str(guessesTaken) + ' guesses!')
    print(pokemon + ' has been captured and sent to the computer!')
else:
    print('Nope. The number I was thinking of was ' + str(secretNumber))
    print('Unfortunatley...' + pokemon + ' escaped...')

