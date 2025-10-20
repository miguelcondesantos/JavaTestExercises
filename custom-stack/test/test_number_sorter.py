from src.custom_stack_class import CustomStack
from src.number_sorter import NumberAscOrder

def test_sort_returns_sorted_list():
    stack = CustomStack(6)
    for n in [10, 4, 22, 3, 7, 15]:
        stack.push(n)

    sorter = NumberAscOrder()
    result = sorter.sort(stack)

    assert result == sorted([10, 4, 22, 3, 7, 15])

def test_sort_with_empty_stack_returns_empty_list():
    stack = CustomStack(6)
    sorter = NumberAscOrder()
    result = sorter.sort(stack)

    assert result == []
