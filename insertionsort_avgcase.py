import random

def insertion_sort(arr):
    swap_count = 0
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
            swap_count += 1
        arr[j + 1] = key
    return arr, swap_count

if __name__ == "__main__":
    arr = [random.randint(1, 100) for _ in range(10)]
    print("Before sorting: ", arr)
    arr, swap_count = insertion_sort(arr)
    print("After sorting: ", arr)
    print("Number of swaps: ", swap_count)