import requests


page = requests.get("https://www.flashscores.co.uk/football/england/premier-league/")

from bs4 import BeautifulSoup
soup = BeautifulSoup (page.content, 'html.parser')
history = soup.find(id="block-summary-results")
forcast = soup.find(id="block-summary-fixtures")
hometeam = soup.find_all(class_="cell_ab team-home")
awayteam = soup.find_all(class_="cell_ab team-away")
goals = soup.find_all(class_="cell_sa score  bold")
results = soup.find(id="fs-summary-results")
lookback = soup.find_all(class_="fs-table  tournament-page")
print(lookback.prettify())