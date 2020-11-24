package ru.nazarov.vlad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

/**
 * @author Rakhmankulov Ed
 */
@Component
@PropertySource("classpath:ru/nazarov/vlad/filenames.properties")
public class FileConsumer implements Consumer<String> {
    private final String fileName;

    public FileConsumer(@Value("${file.consumer}") String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void accept(String s) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(s);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
