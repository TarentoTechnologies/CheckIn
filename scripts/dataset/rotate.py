from scipy.ndimage import rotate
from scipy.misc import imread, imshow

img = imread('John Doe.jpg') # example

rotate_img = rotate(img, 90)

