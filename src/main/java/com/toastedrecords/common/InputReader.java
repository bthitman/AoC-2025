package com.toastedrecords.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputReader {
    public static <T> List<T> parseInput(String fileName) {
        var path = Paths.get("C:\\Users\\btosl\\IdeaProjects\\AoC-2025\\src\\main\\resources\\" + fileName);
        try {
            return (List<T>) Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
