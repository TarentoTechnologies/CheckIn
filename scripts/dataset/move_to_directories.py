import os
import csv
import shutil

for file in os.listdir():
    # harcoded for .jpg (and length 4)
    if file.endswith("jpeg" | "JPEG"):
        shutil.move(file, file[:-5] + 'jpg')
    elif file.endswith("JPG"):
        shutil.move(file, file[:-4] + 'jpg')
    elif file.endswith(".jpg"):
        filename = file[:4] 
        if not os.path.exists(filename):
            os.makedirs(filename)
            shutil.move(file, filename + "/" + file)
            print(filename) # debug
        else:
            shutil.move(file, filename + "/" + file)