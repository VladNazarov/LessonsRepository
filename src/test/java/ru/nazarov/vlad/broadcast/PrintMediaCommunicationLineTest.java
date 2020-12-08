package ru.nazarov.vlad.broadcast;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nazarov.vlad.model.Importance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rakhmankulov Ed
 */
class PrintMediaCommunicationLineTest {
    PrintMediaCommunicationLine printMediaCommunicationLine;

    @BeforeEach
    public void setUp() {
        printMediaCommunicationLine = new PrintMediaCommunicationLine();
    }


    @Test
    public void shouldHaveAllImportanceTagsExceptFatal() {
        List<Importance> importance = printMediaCommunicationLine.importance();
    }

}