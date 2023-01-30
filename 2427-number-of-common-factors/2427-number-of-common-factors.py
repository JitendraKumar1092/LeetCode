class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        lst1 = set()
        lst2 = set()
        for i in range(1,a+1):
            if a % i == 0:
                lst1.add(i)
        for i in range(1,b+1):
            if b %i ==0:
                lst2.add(i)
        return len(lst2.intersection(lst1))
        