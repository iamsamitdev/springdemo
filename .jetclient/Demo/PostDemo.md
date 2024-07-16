```toml
name = 'PostDemo'
method = 'POST'
url = 'http://localhost:8080/api/v1/demodata'
sortWeight = 3000000
id = 'aaea7f91-c7a3-439d-8a66-a9fa30476162'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "id": 3,
  "name": "Joey Deen",
  "email": "joey@email.com",
  "phone": "088990022",
  "address": "255 Main St."
}'''
```
