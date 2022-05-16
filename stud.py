import pymongo
host = "mongodb://localhost:27017"
c = pymongo.MongoClient(host)
db = c["students"]
coll=db["marks"]
r=coll.find(  {"gender":"female","course":"MCA"}   ,{"name.fname":1,"name.lname":1})
for x in r:
	print(x)
print(coll.find_one({"course":"MCA"},{"_id":0},sort=[("mark",-1)]))
a=coll.find({"grade":"A+","gender":"male"},{"_id":0})

for x in a:
	print(x)
for x in coll.find({"course":"Mechanical"},{"_id":0,"name.fname":1}).sort("mark",-1).limit(3):
	print(x)
for x in coll.find({"mark":{"$gt":90}},{"_id":0,"name.fname":1}):
	print(x)
for x in coll.find({"mark":{"$gt":80,"$lt":90}},{"_id":0,"name.fname":1,"name.lname":1}):
       	print(x)
for x in coll.find({"address.city":"Kollam"},{"_id":0,"name.fname":1,"name.lname":1}):
       	print(x)
for x in coll.find({"name.fname":{ "$regex": "^S" }},{"_id":0,"name.fname":1,"name.lname":1}):
	print(x)
y =coll.find({"address.city":{"$nin":["Thiruvananthapuram","Kollam"]}})
for x in y:
	print(x)
for x in coll.find({"address.city":{"$in":["Thiruvananthapuram","Kollam"]}}):
	print(x["name"]["fname"]+" "+x["address"]["city"])

for x in coll.find({"address.city":{"$nin":["Thiruvananthapuram","Kollam"]}}):
	print(x["name"]["fname"]+" "+x["address"]["city"])
for x in coll.find({"$nor":[{"address.city":"Thiruvananthapuram"},{"address.city":"kollam"}]}):
	print(x)

for x in coll.find( { "$nor": [ { "address.city": "Thrivananthapuram" }, {  "course": "MCA" } ]  } ):
	print(x["address"]["city"]+""+x["course"])
