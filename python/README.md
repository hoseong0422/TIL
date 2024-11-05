# Python 
## Python 3.10
### [match statement](match_statement.py)
```python
def http_error(status):
    match status:
        case 400:
            return "Bad request"
        case 404:
            return "Not found"
        case 418:
            return "I'm a teapot"
        case _: # acting like else
            return "Something's wrong with the internet"
```
```python
http_error(400)
-> "Bad request"

http_error(404)
-> "Not found"

http_error(418)
-> "I'm a teapot"

http_error(111)
-> "Something's wrong with the internet"
```
  