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
    private InformationOfName informationOfName;

    public InformationOfNameService(@Qualifier("soutConsumer") Consumer<String> consumer, @Value("${directory.path}") String directory) {
        this.consumer = consumer;
        this.directory = directory;
        setInformationOfName();
    }

    public void getInformation() {
        if (!informationOfName.isEmpty()) {
            consumer.accept("Max name: " + informationOfName.getMaxLengthStr()
                    + System.lineSeparator() + "Count of duplicates: " + informationOfName.getCountOfDuplicates()
                    + System.lineSeparator() + "Count: " + informationOfName.getCount());
        } else {
            consumer.accept("File is empty");
        }

    }

    public InformationOfName getInformationOfName() {
        return informationOfName;
    }

    public void setInformationOfName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file`s name: ");
        String fileName = scanner.next();
        File file = new File(directory + File.separator + fileName);

        if (file.exists()) {
            this.informationOfName = new InformationOfName(file.getPath());

        } else {
            consumer.accept("File not found");
        }
    }
}
