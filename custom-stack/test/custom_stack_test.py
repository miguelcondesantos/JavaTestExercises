from src.custom_stack_class import *

def test_push_one_elementinstack():
    element_value = 5.0

    stack = CustomStack(5)
    stack.push(element_value)
    assert not stack.is_empty()
    assert stack.top() == element_value
    assert stack.size() == 1

def test_push_to_full_stack_raises_exception():
    stack = CustomStack(1)
    stack.push(1)
    try:
        stack.push(2)
        assert False
    except StackFullException:
        pass

def test_pop_returns_last_element():
    stack = CustomStack(3)
    stack.push(10)
    result = stack.pop()
    assert result == 10
    assert stack.is_empty()

def test_pop_on_empty_stack_raises_exception():
    stack = CustomStack(2)
    try:
        stack.pop()
        assert False
    except StackEmptyException:
        pass

def test_top_returns_last_element_without_removing():
    stack = CustomStack(2)
    stack.push(5)
    top_element = stack.top()
    assert top_element == 5
    assert stack.size() == 1

def test_top_on_empty_stack_raises_exception():
    stack = CustomStack(3)
    try:
        stack.top()
        assert False
    except StackEmptyException:
        pass