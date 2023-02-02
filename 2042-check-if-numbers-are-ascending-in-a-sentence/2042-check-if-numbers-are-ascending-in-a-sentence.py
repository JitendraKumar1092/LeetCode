class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        lst = list(map(int,[x for x in s.split() if x.isnumeric()]))
        temp = lst
        lst = list(set(lst))

        return temp == sorted(lst)
        
        
        