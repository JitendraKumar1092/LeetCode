class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        res=[]
        words=set()
        for i in dictionary:
            words.add(i)
        l=list(sentence.split(' '))
        for i in l:
            j=0
            flag=0
            while j<len(i):
                if i[:j] in words:
                    res.append(i[:j])
                    flag=1
                    break
                j+=1
            if flag==0:
                res.append(i)
        return ' '.join(res) 
