#Write a program to find the resolution of an image?
import PIL
from PIL import Image
image = PIL.Image.open("C:/Users/manoj/Downloads/IMG-20211006-WA0000_1633533690298.JPG")
width, height = image.size
print(width, height)