```toml
name = 'PutData'
method = 'PUT'
url = 'http://localhost:8080/api/v1/demodata/3'
sortWeight = 4000000
id = 'f8739d0c-9d8a-4ba0-9f0f-5a5653b249aa'

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
