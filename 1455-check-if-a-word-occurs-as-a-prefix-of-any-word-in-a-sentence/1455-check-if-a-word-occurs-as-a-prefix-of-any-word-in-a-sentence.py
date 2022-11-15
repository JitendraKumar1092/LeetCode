class Solution:
    def isPrefixOfWord(self, sentence: str, searchword: str) -> int:
        sizeofword=len(searchword)
        lst = sentence.split()
        for i in range(len(lst)):
            if searchword == lst[i][:sizeofword] :
                return i+1
        return -1
            