import scrapy

class SportySpider(scrapy.Spider):
    name = 'Sportyspider'
    start_urls = ['https://www.flashscores.co.uk/football/england/premier-league/']

    def parse(self, response):
        for title in response.css('.post-header>h2'):
            yield {'title': title.css('a ::text').extract_first()}

        for next_page in response.css('div.prev-post > a'):
            yield response.follow(next_page, self.parse)
