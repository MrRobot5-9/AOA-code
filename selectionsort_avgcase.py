import random

def selection_sort(arr):
    swap_count = 0
    for i in range(len(arr) - 1):
        min_index = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        if min_index != i:
            arr[i], arr[min_index] = arr[min_index], arr[i]
            swap_count += 1
    return arr, swap_count

if __name__ == "__main__":
    arr = [random.randint(1, 100) for _ in range(10)]
    print("Before sorting: ", arr)
    arr, swap_count = selection_sort(arr)
    print("After sorting: ", arr)
    print("Number of swaps: ", swap_count)