dist = {"manoj":1,"kumar":2,"mohanta":3,"ram":4,"gopal":5}
# print(dist)
# print(dist["manoj"])
# dist.update({"girl":7})
# print(dist)
# print(dist.get("girl"))
# del dist["kumar"]
# print(dist)
# dist.update({"kumar":2})
# print(dist)
boys = {"manoj":1,"dibya":2,"jyoti":3}
girls = {"mona":1,"kusum":2,"soumya":3}
for key in dist.keys():
    if key in boys.keys():
        print(True)
    else:
        print(False)

dist.update({"manoj":21})
print(dist)