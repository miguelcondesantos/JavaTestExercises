from src.custom_stack_class import CustomStack, StackEmptyException

class NumberAscOrder:
    def sort(self, stack: CustomStack):
        if stack.is_empty():
            return []

        numbers = []

        while not stack.is_empty():
            numbers.append(stack.pop())

        return sorted(numbers)
