package com.verma.beansJaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyJaxBean {
	@XmlElement
	public String name;
	@XmlElement
    public int age;

    public MyJaxBean() {} // JAXB needs this

    public MyJaxBean(String name, int age) {
      this.name = name;
      this.age = age;
    }
	
	

}
