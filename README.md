# PalindromePermutation
Exercise related with Arrays and Strings.

## Exercise Challenge
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forward and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. You can ignore casing and non-letter characters.

### Solution
I do it by bit manipulation. I basically keep track if the frequency is even or odd simply by toggleing a bit in a bitVector. 
If some bit is toggled it means that the frequency of the character corresponding to that bit is odd. Otherwise, is even. 
Then I do a bit manipulation and operations to check if, at the end, there is at most one bit set to one (which means that only one of the frequencies is odd).
