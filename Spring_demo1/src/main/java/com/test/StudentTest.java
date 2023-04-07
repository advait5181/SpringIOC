package com.test;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import org.springframework.core.io.ClassPathResource;


public class StudentTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinitionRegistry reg = (BeanDefinitionRegistry) factory;

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);

        reader.loadBeanDefinitions(new ClassPathResource("studentconfig.xml"));

        Student student = (Student) factory.getBean("studentbean");

        student.displayInfo();
	}
}
