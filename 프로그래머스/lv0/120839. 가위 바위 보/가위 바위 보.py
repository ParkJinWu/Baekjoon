def solution(rsp):
    tmp = {"2" : "0", "0": "5", "5":"2"}
    answer = ""
    for i in rsp:
        answer+=tmp[str(i)]
        
    return answer