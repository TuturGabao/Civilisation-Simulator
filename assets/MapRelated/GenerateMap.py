import csv
import random

numbDiffTiles = 1

rows = cols = 4096
chunks = 64

dataMap = []

for i in range(cols):
    currCol = []
    for j in range(rows):
        currCol.append(random.randint(1, numbDiffTiles))
    dataMap.append(currCol)

with open("output.csv", mode="w", newline="", encoding="utf-8") as file:
    writer = csv.writer(file)
    writer.writerows(dataMap)

print("Map successfully created !")