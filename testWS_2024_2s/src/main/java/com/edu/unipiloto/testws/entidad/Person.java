
package com.edu.unipiloto.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Andrea
 */
@XmlRootElement(name = "persona")
@XmlType(propOrder = {"id", "fullName", "age", "salary"})
public class Person {

    private int id;
    private String fullName;
    private int age;
    private double salary;
  private static final double SALARIO_MINIMO = 1400000;
    
    public Person() {
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @XmlElement
    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary=(this.age*SALARIO_MINIMO)/3;
    }

}
