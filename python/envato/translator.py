ch = 'y'
while ch == 'y':
	word = raw_input('Enter the word which is to be converted to Assamese  : ')
	latin = word[3:] + word[2] + 'hoe'
	print('converted word : '+latin)
	ch = input("\nwant to convert more  : ")