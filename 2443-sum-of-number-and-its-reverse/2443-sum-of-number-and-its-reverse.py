class Solution:
    def sumOfNumberAndReverse(self, num: int) -> bool:
        for n in range(num//2,num+1):
            a = str(n)		
            b = a[::-1]	
            
            if int(a)+int(b)== num:
                return True
        return False