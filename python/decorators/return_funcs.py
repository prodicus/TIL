#!/usr/bin/env python

import pdb

def surround_with(surround):
    def value(word):
        return '{}{}{}'.format(surround, word, surround)
    return value

def transform_words(content, targets, renamed_func):
    result = ''
    for word in content.split():
        if word in targets:
            result += ' {}'.format(renamed_func(word))
        else:
            result += ' {}'.format(word)
    return result

user_content = "Tasdik has a weak spot for Python in his heart"
final_result = transform_words(user_content, ["Tasdik", "Python"], surround_with('*'))
print final_result
