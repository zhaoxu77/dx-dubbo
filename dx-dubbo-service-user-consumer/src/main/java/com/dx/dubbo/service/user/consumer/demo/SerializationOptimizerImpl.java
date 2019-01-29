package com.dx.dubbo.service.user.consumer.demo;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-29 14:32
 **/
public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();

        return classes;
    }
}
