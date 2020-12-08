package ru.nazarov.vlad.broadcast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.nazarov.vlad.model.Importance;

import java.util.*;

/**
 * конфигурация приоритетов линий связи
 *
 * @author Rakhmankulov Ed
 */
@Configuration
public class BroadcastLinesConfiguration {
    private final List<CommunicationLine> allCommunicationLines;

    @Autowired
    public BroadcastLinesConfiguration(List<CommunicationLine> allCommunicationLines) {
        this.allCommunicationLines = allCommunicationLines;
    }

    @Bean
    public Map<Importance, List<CommunicationLine>> communicationLineConfiguration() {
        Map<Importance, List<CommunicationLine>> result = new HashMap<>();
        for (CommunicationLine line : allCommunicationLines) {
            if (line instanceof IHasImportance) {
                IHasImportance lineWithImportance = (IHasImportance) line;

                for (Importance importance : lineWithImportance.importance()) {
                    result.computeIfAbsent(importance, i -> new ArrayList<>()).add(line);
                }
            }
        }
        return result;
    }
}
