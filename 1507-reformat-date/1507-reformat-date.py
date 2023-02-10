class Solution:
    def reformatDate(self, date: str) -> str:
        arr = date.split()
        if len(arr[0])==3:
            
            arr[0] = "0" + arr[0][:1]
        else:
             arr[0] = arr[0][:2]
        arr[2] = arr[2]
        months = {"Jan": "01", "Feb":"02", "Mar":"03", "Apr":"04", "May":"05", "Jun":"06", "Jul":"07", "Aug":"08", "Sep":"09", "Oct":"10", "Nov":"11", "Dec":"12"}
        arr[1]= months[arr[1]]
        return arr[2] + "-" + arr[1] + "-" + arr[0]

        