def sort_array(arr):
    new_array = []
    for x in range(len(arr)):
        smallest_index = find_lowest_value(arr)
        new_array.append(arr.pop(smallest_index))
    return new_array


def find_lowest_value(arr):
    smallest = arr[0]
    smallest_index = 0
    for x in range(len(arr)):
        if smallest > arr[x]:
            smallest_index = x
            smallest = arr[x]
    return smallest_index


arr = [2, -5, -1, 10, 6, 9]
arr_sorted = sort_array(arr)
print(arr_sorted)
