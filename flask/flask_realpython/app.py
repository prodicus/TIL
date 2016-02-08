#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Author: tasdik
# @Date:   2016-02-08
# @Email:  prodicus@outlook.com  Github username: @prodicus
# @Last Modified by:   tasdik
# @Last Modified time: 2016-02-08
# MIT License. You can find a copy of the License @
# http://prodicus.mit-license.org


from flask import Flask, render_template


app = Flask(__name__)

@app.route('/')
def index():
    return "Hello world"


@app.route('/welcome')
def welcome():
    return render_template("welcome.html")


if __name__ == "__main__":
    app.run(debug=True, port=3000)