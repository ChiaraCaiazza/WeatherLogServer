/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wlspa.weatherlogserver.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gionatanG
 */
@XmlRootElement(name = "cityLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityLog {
    
    @XmlAttribute(name= "id")
    private Integer cityId = null;
    
    @XmlAttribute(name = "name")
    private String cityName = null;
    
    @XmlElement(name = "measurement_group")
    private List<MeasurementGroup> measurements = null;
    
    public Integer getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }
    
    public List<MeasurementGroup> getMeasurements()
    {
        return measurements;
    }
    
    public void setCity(City city)
    {
        cityId = city.getId();
        cityName = city.getName();
        
    }
    
    public void setMeasurements(List<MeasurementGroup> measurements)
    {
        this.measurements = measurements;
    }
}
