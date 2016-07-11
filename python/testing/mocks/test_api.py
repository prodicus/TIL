from nose.tools import assert_true
import requests


def test_request_response():
    resp = requests.get('http://jsonplaceholder.typicode.com/todos')

    assert_true(resp.ok)

