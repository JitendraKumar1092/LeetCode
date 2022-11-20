class Solution:
    def arrangeWords(self, text: str) -> str:
        list_words = text.split()
        list_words[0] = list_words[0].lower()
        list_words.sort(key=len)
        list_words[0]=list_words[0].title()
        return ' '.join(list_words)
        
        