import random
import time

import ArrayDemo
import ListDemo
import DequeDemo

# The random function used here will of course use different calculations so using the same seed would be unnecessary
# Still gave it the seed functionality, though.
random.seed(12345)
HOW_MANY_NUMS = 10**8

# Notably, the numbers generated are not integers, but floats
# This is because the random module can not return its state as a discrete number (only as an object)
# Therefore, a specific random.xyz function must be used to generate a number each time
# random.randint(0,999999) generated numbers similar to the Java version, but took considerably longer to generate than random.random() (returning floats)
# Since the test is about inputting items into collections (not generating random numbers), and random.randint() took ~4-5 longer, random.random() was used instead
# This does introduce some variance from the Java version in that floats may take a different amount of bytes to store which may affect inputting them into collections
# However, since all tests are using random.random(), this shouldn't pose too much of a problem
start = round(time.time() * 1000)
ArrayDemo.demo(HOW_MANY_NUMS, random)
end = round(time.time() * 1000)
print(f"Array Time: {(end - start) / 1000} seconds\n")

start = round(time.time() * 1000)
ListDemo.demo(HOW_MANY_NUMS, random)
end = round(time.time() * 1000)
print(f"List Time: {(end - start) / 1000} seconds\n")

start = round(time.time() * 1000)
DequeDemo.demo(HOW_MANY_NUMS, random)
end = round(time.time() * 1000)
print(f"Deque Time: {(end - start) / 1000} seconds\n")