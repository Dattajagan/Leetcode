class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        l,r = 0, 0
        while l< len(haystack):
            if haystack[l] == needle[r]:
                r +=1
                if r == len(needle):
                    return l - r + 1
            else:
                l -=r
                r = 0
            l +=1
        return -1