package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.AbstractEntity;

/**
 * абстрактный репо сущностей
 *
 * @author Rakhmankulov Ed
 */
public interface AbstractRepository<T extends AbstractEntity> {
    /**
     * добавляет новую сущность
     * @return false если уже существует сущность с данным id
     */
    boolean addEntity(T entity);

    /**
     * возвращает существующую сущность по id
     * @return null если сущность с id не найдена
     */
    T getEntityById(String id);

    /**
     * обновляет существующую сущность с id
     * @return false если такой сущности нет
     */
    boolean updateEntityById(String id, T entity);

    /**
     * удаляет сущность по id
     * @return false если ничего не было удалено
     */
    boolean removeEntityById(String id);
}
