import os
import shutil

for file in os.listdir():
    last_chars = -4
    if file.endswith("jpeg" | "JPEG"):
        last_chars = -5
    if file.endswith("jpeg" | "JPEG" | "JPG"):
        shutil.move(file, "{}.{}".format(file[:last_chars], "jpg"))
        print(file + "converted to .jpg") # debug