//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 10:55:36 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="totalNumInResultSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subscriptionDetails" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfSubscription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalNumInResultSet",
    "subscriptionDetails"
})
@XmlRootElement(name = "ARBGetSubscriptionListResponse")
public class ARBGetSubscriptionListResponse
    extends ANetApiResponse
{

    protected Integer totalNumInResultSet;
    protected ArrayOfSubscription subscriptionDetails;

    /**
     * Gets the value of the totalNumInResultSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumInResultSet() {
        return totalNumInResultSet;
    }

    /**
     * Sets the value of the totalNumInResultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumInResultSet(Integer value) {
        this.totalNumInResultSet = value;
    }

    /**
     * Gets the value of the subscriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscription }
     *     
     */
    public ArrayOfSubscription getSubscriptionDetails() {
        return subscriptionDetails;
    }

    /**
     * Sets the value of the subscriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscription }
     *     
     */
    public void setSubscriptionDetails(ArrayOfSubscription value) {
        this.subscriptionDetails = value;
    }

}
