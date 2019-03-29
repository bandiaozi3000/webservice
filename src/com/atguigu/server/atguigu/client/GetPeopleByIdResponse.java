
package com.atguigu.server.atguigu.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPeopleByIdResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getPeopleByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Impl.server.atguigu.com/}people" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPeopleByIdResponse", propOrder = {
    "_return"
})
public class GetPeopleByIdResponse {

    @XmlElement(name = "return")
    protected People _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link People }
     *     
     */
    public People getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link People }
     *     
     */
    public void setReturn(People value) {
        this._return = value;
    }

}
