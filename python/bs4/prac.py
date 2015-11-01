#!/usr/bin/env python

import requests 
from bs4 import BeautifulSoup

def main() : 
	url = "http://www.yellowpages.com/search?search_terms=coffee&geo_location_terms=Los+Angeles%2C+CA"
	r = requests.get(url)

	soup = BeautifulSoup(r.content)
	print soup.prettify

	links = soup.find_all("a")

	for link in links : 
		print "<a href = '%s'>%s</a>" % (link.get("href"), link.text)

	g_data = soup.find_all("div", {"class" : "info"})

	
if __name__ == "__main__" : 
	main()