import array

def demo(howManyNums:int, random):
    # This might look a little weird, but it's to initialize the area with a specific size, like in the Java version
    # Notably, initializing it as an empty array and then appending did not seem to change the time much, if at all
    nums = array.array('f', [0] * howManyNums)
    for i in range(howManyNums):
        nums[i] = random.random()

    print("The first few numbers are: ")
    for i in range(5):
        print(nums[i])