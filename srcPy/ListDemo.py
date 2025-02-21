def demo(howManyNums, random):
    nums = []
    for i in range(howManyNums):
        nums.append(random.random())

    print("The first few numbers are: ")
    for i in range(5):
        print(nums[i])