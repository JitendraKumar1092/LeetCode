/**
 * @param {string} s
 * @return {boolean}
 */
var areNumbersAscending = function(s) {
    var previous = 0;
    for(let i =0;i<s.length;++i)
        {
            if(s[i]>='0' && s[i]<='9')
                {
                    let num ='';
                    while(i<s.length && s[i]>='0' && s[i]<='9')
                            num +=(s[i]),++i;
                    if(parseInt(num)<=parseInt(previous))return 0;
                    previous = num;
                }
        }
    return 1;
};