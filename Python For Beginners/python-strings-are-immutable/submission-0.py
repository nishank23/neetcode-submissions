def remove_fourth_character(word: str) -> str:
    firstpart = word[:3];
    secondpart = word[4:];
    return firstpart + secondpart


# do not modify below this line
print(remove_fourth_character("NeetCode"))
print(remove_fourth_character("Hello"))
