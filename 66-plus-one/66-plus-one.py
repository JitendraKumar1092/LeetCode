class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        s=""
        for i in digits:
            t = str(i)
            s = s +t
        num = int(s)
        num = num +1
        n = len(str(num))
        lst = []
        for i in range(n):
            temp = num%10
            lst.append(temp)
            num = num//10
        return lst[::-1]

    