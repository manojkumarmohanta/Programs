from turtle import *
color('blue', 'yellow')
begin_fill()
while True:
    backward(200)
    left(170)
    if abs(pos()) < 1:
        break
end_fill()
done()