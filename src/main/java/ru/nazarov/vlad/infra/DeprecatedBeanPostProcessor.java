package ru.nazarov.vlad.infra;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 */
@Component
public class DeprecatedBeanPostProcessor implements BeanPostProcessor {
    Set<String> nameBeans = new HashSet<>();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(DeprecatedBean.class)) {
            nameBeans.add(beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (nameBeans.contains(beanName)) {
            System.out.println("You are using deprecated bean " + beanName + "!!!");
        }
        return bean;
    }
}
