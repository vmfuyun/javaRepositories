show dbs
use config
show collection
use test
db.createCollection("users")
db.createCollection("user")
db.user.drop()
db.users.insert({id:1,name:"chengdalin"})
db.users.find()
db.users.updateOne({name:"chengdalin"},{$set:{name:"dadiao"}})
db.users.find()
db.users.insert({id:3,name:"tanran"})
db.users.find()
db.users.updateMany({name:"tanran"},{$set:{name:"zizai"}})
db.users.deleteOne({_id:ObjectId("5d16ebafb8d3d43a450ba1a0")},{fustOne:true})
db.users.find().sort({id:-1})
db.users.find().limit(3).skip(1)
//通过某一个字段的设定 升序1  降序-1
db.users.find().sort({id:-1})
//分页 skip是开始索引,limit是每页要显示的数据的个数
db.users.find().skip(2).limit(3)
//等值查询
db.users.find({name:"dadiao"})
db.users.drop()

