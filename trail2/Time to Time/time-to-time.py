a, b, c, d = map(int, input().split())

# Please write your code here.

if d-b > 0:
    print((c-a) * 60 + d-b)
else:
    print((c-a-1) * 60 + d-b+60)
