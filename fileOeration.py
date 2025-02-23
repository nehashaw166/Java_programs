# f = open("demo.txt", "w")
# f.write("\nLorem Ipsum is simply dummy text of the printing and typesetting industry.\nLorem Ipsum has been the industry's standard dummy")
# print(f.read)
# f.close()
with open("practice.txt",'r')as f:
    data = f.read();
    # print(data)
    new_data = data.find("java")

# with open("practice.txt", 'w') as f:
#     f.write(new_data)
    print(new_data)


