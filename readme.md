The data is located in a csv file in musicdb/music/music/spiders/
This data is scrapped from the followign website : 
http://nachtbraken.blogspot.com/2006/08/top-1000-songs-of-last-30-years-mp3.html

The structure is as follows : 

| artist | link | track |
|--------|------|-------|
|        |      |       |

sql table code :
```
CREATE TABLE music(
	id SERIAL PRIMARY KEY,
	artist  VARCHAR(256),
	link 	VARCHAR(500),
	track	VARCHAR(256)
)
```

There is also a file containing all the insert values data.sql 

There is also another way to copy data to the postgres :

```
\copy music (artist,link,track) FROM 'path/to/music.csv' DELIMITER ',' CSV HEADER
```

There is also a java mimi exmaple on how the music database is used. 
