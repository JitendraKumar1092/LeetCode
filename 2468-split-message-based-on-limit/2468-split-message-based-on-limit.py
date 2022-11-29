class Solution:
    def splitMessage(self, msg: str, lim: int) -> List[str]:

            def sz(n) : return len(str(n))                       # a helper function to get a number of digits

            p = a = 1                                            # a number of parts and a total length of a-indices

            while p * (sz(p) + 3) + a + len(msg) > p * lim:      # [1] check that current number of parts is not enough...
                if 3 + sz(p) * 2 >= lim : return []              # [2] ...or break if the separation is not possible
                p += 1                                           # [3] try an increased number of parts
                a += sz(p)                                       # [4] also, increase the total length of a-indices

            parts = []                                           # [5] at this point, we either obtained the minimal number 
                                                                 #     of parts 'p' or have returned an empty list 
            for i in range(1,p+1):
                j = lim - (sz(p)+sz(i)+3)                        # [6] for each part, find how many symbols to bite off 
                part, msg = msg[0:j], msg[j:]                    # [7] bite off a piece of string...
                parts.append(f"{part}<{i}/{p}>")                 # [8] ...and format a suffix-tagged part

            return parts