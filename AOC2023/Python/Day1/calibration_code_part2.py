# --- Part Two ---
numbers = {'one': '1', 'two': '2', 'three': '3', 'four': '4', 'five': '5', 'six': '6', 'seven': '7', 'eight': '8', 'nine': '9'}

numbers.update({str(i): str(i) for i in range(1, 10)})

def calibration_str(values: list[str]) -> int:
    calibration_sum = 0
    for value in values:

        find_first = sorted([(value.find(number), numbers[number]) for number in numbers if value.find(number) != -1])
        find_last = sorted([(value.rfind(number), numbers[number]) for number in numbers if value.rfind(number) != -1])

        calibration_sum += int(find_first[0][1] + find_last[-1][1])
    return calibration_sum

test_values2 = ['two1nine', 'eightwothree', 'abcone2threexyz', 'xtwone3four', '4nineeightseven2', 'zoneight234', '7pqrstsixteen']

assert calibration_str(test_values2) == 281

with open("AOC2023/Python/Day1/day1_puzzle2.txt", 'r') as f:
    input_values = [line for line in f.read().splitlines()]

print(input_values[:5])
calibration_str(input_values)
# 54706
