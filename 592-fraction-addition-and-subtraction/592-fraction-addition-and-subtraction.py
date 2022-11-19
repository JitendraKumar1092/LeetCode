from fractions import Fraction

class Solution:
    def fractionAddition(self, expression: str) -> str:
        res = sum(map(Fraction, expression.replace('+', ' +').replace('-', ' -').split()))
        return str(res.numerator) + '/' + str(res.denominator)
