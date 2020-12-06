package org.nazarov.vlad;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Scanner;
import java.util.function.Consumer;

@Component
@PropertySource("classpath:org/nazarov/vlad/filenames.properties")
public class InformationOfNameService {
    private final Consumer<String> consumer;
    private final String directory;

    public InformationOfNameService(@Qualifier("soutConsumer")Consumer<String> consumer, @Value("${directory.path}") String directory) {
        this.consumer = consumer;
        this.directory = directory;
    }

    public void getInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file`s name: ");
        String fileName = scanner.next();
        File file = new File(directory + File.separator + fileName);

        if (file.exists()) {
            InformationOfName information = new InformationOfName(file.getPath());

            if (!information.isEmpty()) {
                consumer.accept("Max name: " + information.getMaxLengthStr()
                        + System.lineSeparator() + "Count of duplicates: " + information.getCountOfDuplicates()
                        + System.lineSeparator() + "Count: " + information.getCount());
            } else {
                consumer.accept("File is empty");
            }

        } else {
            consumer.accept("File not found");
        }

    }
}
