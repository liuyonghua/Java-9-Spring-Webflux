package com.dockerx.traffic.providespro.service;


import com.dockerx.traffic.providespro.entity.Person;

/**
 * @author Author  知秋
 * @email fei6751803@163.com
 * @time Created by Auser on 2017/11/20 22:14.
 */
public interface Analysis {
    String analyze(Person person);
    String getName();
}
