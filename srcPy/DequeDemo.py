from collections import deque

def demo(howManyNums, random):
    nums = deque([])
    for i in range(howManyNums):
        nums.append(random.random())

    print("The first few numbers are: ")
    for i in range(5):
        print(nums[i])