package org.nazarov.vlad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;


public class InformationOfName {
    private String maxLengthStr;
    private int countOfDuplicates;
    private int count;
    private boolean isEmpty;
    private String[] names;

    public InformationOfName(String path) {
        setInformation(path);
    }

    public int getCount() {
        return count;
    }

    public String[] getNames() {
        return names;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getCountOfDuplicates() {
        return countOfDuplicates;
    }

    public String getMaxLengthStr() {
        return maxLengthStr;
    }

    private void setInformation(String path) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            LinkedList<String> names = new LinkedList<>();

            while (bufferedReader.ready()) {
                String str = bufferedReader.readLine();

                if (!str.isBlank()) {
                    str = str.toLowerCase();
                    String[] strings = str.split("\\s+");
                    names.addAll(Arrays.asList(strings));
                }

            }
            this.names = names.toArray(new String[0]);


            if (!names.isEmpty()) {
                this.isEmpty = false;
                String max = "";
                String str;

                for (String name : names) {
                    str = name;

                    if (str.length() > max.length()) {
                        max = str;
                    }
                }

                HashSet<String> set = new HashSet<>(names);


                this.countOfDuplicates = names.size() - set.size();
                this.count = names.size();
                this.maxLengthStr = max;
            } else {
                this.isEmpty = true;
            }

        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
