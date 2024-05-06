#Write a program that fetches data from a specified url and writes it in a file?
import requests
import json
response = requests.get("C:/WORKLOAD/online_class/")
data = json.loads(response.content)
with open('output.json', 'w') as f:
    json.dump(data, f)