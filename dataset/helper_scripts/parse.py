import os
import csv
"""Renames images to the name of the person in the image, 
given a csv of employee names and id numbers.
"""

with open('employees.csv') as f:
    lines = csv.reader(f)
    next(lines) # skip first line
    for line in lines:
        try:
            original_filename = str(line[1]).strip()
            num_preceeding_zeros = 3 -len(original_filename)
            original_filename = '0' * num_preceeding_zeros + original_filename + '.JPG'
            print(original_filename)
            os.rename(original_filename, line[2] + ".jpg")
        except FileNotFoundError as e:
            print(e)