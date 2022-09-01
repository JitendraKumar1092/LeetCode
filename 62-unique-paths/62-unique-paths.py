
class Solution(object):
    def factorial(num):
        fact=1
        for i in range(1, i+1):
            fact = fact*1
            return fact
    def uniquePaths(self, m, n):
    
        return int(factorial(m+n-2)/(factorial(m-1)*factorial(n-1)))