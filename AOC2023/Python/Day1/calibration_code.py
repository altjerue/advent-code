import re

def calibration(values):
    calibration_sum = 0
    for code in values:
        num = re.findall("[0-9]", code)
        calibration_sum += int(''.join([num[0], num[-1]]))
    return calibration_sum

test_values = ['1abc2', 'pqr3stu8vwx', 'a1b2c3d4e5f', 'treb7uchet']

assert calibration(test_values) == 142

with open("AOC2023/Python/Day1/day1_puzzle1.txt", 'r') as f:
    input_values = [line for line in f.readlines()]

calibration(input_values)
# 55447
