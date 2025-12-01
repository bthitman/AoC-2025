package com.toastedrecords;

import com.toastedrecords.common.InputReader;

import java.util.List;

public class Day01 {
    static void main() {
        List<String> day01 = InputReader.parseInput("Day01");
        String[] instructions = new String[2];
        int curPosition = 50;
        int codeCount = 0;
        for(var line : day01) {
            instructions[0] = line.substring(0,1);
            instructions[1] = line.substring(1);
            switch (instructions[0]) {
                case "L" -> curPosition -= Integer.parseInt(instructions[1]);
                case "R" -> curPosition += Integer.parseInt(instructions[1]);
            }
//            System.out.println("Current Position: " + curPosition);
            if (curPosition % 100 == 0) {
//                System.out.println("Landed At Position 0");
                codeCount++;
            }
        }
        System.out.println("Part 1: " + codeCount);


        // Part 2
        day01 = InputReader.parseInput("Day01");
        instructions = new String[2];
        int total = 50;
        int counter = 0;
        int next_total;
        int number = 0;
        for(var line : day01) {
            instructions[0] = line.substring(0, 1);
            instructions[1] = line.substring(1);
            switch (instructions[0]) {
                case "L" -> number = -Integer.parseInt(instructions[1]);
                case "R" -> number = Integer.parseInt(instructions[1]);
            }

            next_total = total + number;
            if (next_total <= 0) {
                counter += (int) Math.abs(Math.floor((double)next_total / 100));
                if (next_total % 100 == 0) {
                    counter+=1;
                }
                if (total == 0) {
                    counter-=1;
                }
            } else if (next_total >= 100) {
                counter += (int) Math.abs(Math.floor((double)next_total / 100));
            }
            total = (((next_total % 100) + 100) % 100);
        }
        System.out.println("Part 2: " + counter);

        // Part 2
//        day01 = InputReader.parseInput("Day01");
//        instructions = new String[2];
//        curPosition = 50;
//        codeCount = 0;
//        int number = 0;
//        for(var line : day01) {
//            instructions[0] = line.substring(0, 1);
//            instructions[1] = line.substring(1);
//            switch (instructions[0]) {
//                case "L" -> number = -Integer.parseInt(instructions[1]);
//                case "R" -> number = Integer.parseInt(instructions[1]);
//            }
//            curPosition += number;
//
//            if (curPosition > 99 || curPosition < 0) {
//                if (curPosition < 0) {
//                    curPosition = 100 - Math.abs(curPosition);
//                    codeCount++;
//                }
//                while (curPosition > 100) {
//                    curPosition -= 100;
//                    codeCount++;
//                }
//            }
//            if (curPosition == 0)
//                codeCount++;
//        }
//
//        System.out.println("Part 2: " + codeCount);
    }
}
