import random
def getAnswer(answerNumber):
        if answerNumber == 1:
           return 'It is certain'
       elif answerNumber == 2:
           return 'It is confidently so'
       elif answerNumber == 3:
           return 'Yes'
       elif answerNumber == 4:
           return 'Unsure, try again'
       elif answerNumber == 5:
           return 'Ask again later'
       elif answerNumber == 6:
           return 'Concentrate and ask again'
       elif answerNumber == 7:
           return 'No'
       elif answerNumber == 8:
           return 'Doesnt look like it'
       elif answerNumber == 9:
           return 'Very doubtful'
        elif answerNumber == 10:
            return 'Absolutely Not'

r = random.randint(1, 10)
fortune = getAnswer(r)
print(fortune)
