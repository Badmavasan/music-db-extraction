import scrapy

class MusicItem(scrapy.Item):
	artist = scrapy.Field()
	track = scrapy.Field()
	link = scrapy.Field()
class MusicSpider(scrapy.Spider):
	name = "music"
	def start_requests(self):
		urls = [
			'http://nachtbraken.blogspot.com/2006/08/top-1000-songs-of-last-30-years-mp3.html',
		]

		for url in urls:
			yield scrapy.Request(url=url, callback=self.parse)

	def parse(self, response):
		for music in response.css('div.post a'):
			artist_track = music.css('a::text').extract_first().split('-')
			item = MusicItem()
			item['artist'] = artist_track[1].strip()
			item['track'] = artist_track[-1].strip()
			item['link'] = music.css('a::attr(href)').extract_first()
			yield item
