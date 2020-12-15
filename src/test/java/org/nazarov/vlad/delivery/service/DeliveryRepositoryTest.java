package org.nazarov.vlad.delivery.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nazarov.vlad.delivery.model.AbstractEntity;
import org.nazarov.vlad.delivery.model.Courier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeliveryRepositoryTest {
    public static final String TEST_ID = "1";
    public static final String TEST_NAME = "Vasya";
    DeliveryRepository<Courier> entityRepository;
    AbstractEntity entity;

    @BeforeEach
    public void setUp() {
        entity = new Courier(TEST_ID, TEST_NAME);
        Map<String, Courier> entityMap = new HashMap<>();
        entityMap.put(TEST_ID, (Courier) entity);
        entityRepository = new DeliveryRepository<>(entityMap);
    }

    @Test
    public void shouldGetAbstractEntity() {
        assertEquals(entity, entityRepository.getEntity(TEST_ID));
    }

    @Test
    public void shouldAddNewEntity() {
        Courier courierKatya = new Courier("2", "Katya");
        entityRepository.addEntity(courierKatya);

        assertEquals(courierKatya, entityRepository.getEntity("2"));
    }

    @Test
    public void shouldDeleteEntity() {
        entityRepository.deleteEntity(TEST_ID);
        assertNull(entityRepository.getEntity(TEST_ID));
    }

    @Test
    public void shouldGetListOfEntities() {
        List<Courier> listOfEntities = entityRepository.getListOfEntities();
        assertEquals(TEST_NAME, listOfEntities.get(0).getName());
    }
}
