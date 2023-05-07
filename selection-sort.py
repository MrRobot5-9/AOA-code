def selection_sort(arr):
    steps = 0
    for i in range(len(arr)):
        min_index = i
        for j in range(i + 1, len(arr)):
            steps += 1
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr, steps
import random

# Generate a list of 10 random numbers between 0 and 99
arr = [random.randint(0, 200) for _ in range(10)]

# Print the original list
print("Original list:", arr)

# Sort the list using selection sort and count the steps
sorted_arr, steps = selection_sort(arr)

# Print the sorted list and the number of steps taken
print("Sorted list:", sorted_arr)
print("Number of steps:", steps)