class Solution:
    def relativeSortArray(self, A, v):
        return sorted(A, key=(v + sorted(A)).index)