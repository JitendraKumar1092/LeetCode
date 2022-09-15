class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        s="" 
        lst =[]
        for i in num:
            s+= str(i)
        nm = int(s) + k
        ns = str(nm)
        for i in ns:
            lst.append(int(i))
      
        return lst
     
            
        