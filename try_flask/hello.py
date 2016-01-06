from flask import Flask
from flask import request


app = Flask(__name__)


@app.route('/')
def index(name="Tasdik"):
    return "Hello {}".format(name)

app.run(debug=True, port=8000, host='0.0.0.0')