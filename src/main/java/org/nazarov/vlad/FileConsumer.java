package org.nazarov.vlad;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

@Component
public class FileConsumer implements Consumer<String> {
    private final String pathToResult;

    public FileConsumer(String pathToResult) {
        this.pathToResult = pathToResult;
    }

    @Override
    public void accept(String s) {
        try (FileWriter fileWriter = new FileWriter(pathToResult)) {
            fileWriter.append(s);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
