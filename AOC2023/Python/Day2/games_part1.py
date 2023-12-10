# --- Day 2: Part 1 ---
import re

def check_num_cubes(game: list[str]) -> int:

    game_id = game.split(": ")[0]
    rounds = game.split(": ")[1].split("; ")
    for round in rounds:

        colors = {"blue": 0, "green": 0, "red": 0}
        color_finds = re.findall(r"([0-9]+)\s(\w+)", round)
        for num, color in color_finds:
            colors[color] = int(num)

        possible_round = (colors["blue"] <= 14) & (colors["red"] <= 12) & (colors["green"] <= 13)
        if not possible_round:
            print("{0} is possible? {1}".format(
                game.split(": ")[0],
                possible_round
                ))
            return 0

    print("{0} is possible? {1}".format(
        game_id,
        possible_round
        ))
    return int(game_id.split()[1])

games_test = ["Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
              "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
              "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
              "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
              "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"]

sum_of_ids = 0
for game in games_test:
    sum_of_ids += check_num_cubes(game)
print(sum_of_ids)

sum_of_ids = 0
with open("AOC2023/Python/Day2/input_day2_part1.txt", 'r') as f:
    for line in f.read().splitlines():
        sum_of_ids += check_num_cubes(line)
    print(sum_of_ids)
