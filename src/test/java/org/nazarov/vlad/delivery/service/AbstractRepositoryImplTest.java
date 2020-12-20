package org.nazarov.vlad.delivery.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nazarov.vlad.delivery.model.Courier;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractRepositoryImplTest {

    AbstractRepositoryImpl<Courier> abstractRepository;
    public static final String TEST_NAME = "Jensen";
    public static final String TEST_ID = "1";
    Courier testCourier;


    @BeforeEach
    public void setUp() {
        abstractRepository = new AbstractRepositoryImpl<>() {
            @Override
            public boolean updateEntityById(String id, Courier entity) {
                return false;
            }
        };

        testCourier = new Courier(TEST_ID, TEST_NAME);
        abstractRepository.addEntity(testCourier);

    }

    @Test
    public void shouldAddEntity() {
        Courier courier = new Courier("2", "Kate");
        abstractRepository.addEntity(courier);
        assertEquals(courier, abstractRepository.getEntityById("2"));
    }

    @Test
    public void shouldReturnFalseIfEntityNotAdded() {
        boolean isAdded = abstractRepository.addEntity(new Courier(TEST_ID, "John"));
        assertFalse(isAdded);
    }


    @Test
    public void shouldGetEntityById() {
        assertEquals(testCourier, abstractRepository.getEntityById(TEST_ID));
    }

    @Test
    public void shouldReturnNullIfEntityNotExist() {
        assertNull(abstractRepository.getEntityById("3"));
    }

    @Test
    public void shouldRemoveEntityById() {
        abstractRepository.removeEntityById(TEST_ID);
        assertNull(abstractRepository.getEntityById(TEST_ID));
    }

    @Test
    public void shouldReturnFalseIfNotDeleted() {
        boolean isDeleted = abstractRepository.removeEntityById("3");
        assertFalse(isDeleted);
    }
}
