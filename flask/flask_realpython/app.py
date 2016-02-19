#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Author: tasdik
# @Date:   2016-02-08
# @Email:  prodicus@outlook.com  Github username: @prodicus
# @Last Modified by:   tasdik
# @Last Modified time: 2016-02-18
# MIT License. You can find a copy of the License @
# http://prodicus.mit-license.org


from flask import Flask, render_template, request, redirect, url_for


app = Flask(__name__)

@app.route('/')
def index():
    return 'Hello world'


@app.route('/welcome/')
def welcome():
    return render_template('welcome.html')

@app.route('/login/', methods=['GET', 'POST'])
def login():
    error = None
    if request.method == 'POST':
        if request.form['username'] != 'admin' or request.form['password'] != 'admin':
            error = 'Invalid username and password'
        else:
            return redirect(url_for('welcome'))
    return render_template('login.html', error=error)


if __name__ == '__main__':
    app.run(debug=True, port=3000)