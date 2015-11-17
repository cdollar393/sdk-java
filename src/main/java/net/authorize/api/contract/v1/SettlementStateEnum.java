//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 10:55:36 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settlementStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="settlementStateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="settledSuccessfully"/>
 *     &lt;enumeration value="settlementError"/>
 *     &lt;enumeration value="pendingSettlement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "settlementStateEnum")
@XmlEnum
public enum SettlementStateEnum {

    @XmlEnumValue("settledSuccessfully")
    SETTLED_SUCCESSFULLY("settledSuccessfully"),
    @XmlEnumValue("settlementError")
    SETTLEMENT_ERROR("settlementError"),
    @XmlEnumValue("pendingSettlement")
    PENDING_SETTLEMENT("pendingSettlement");
    private final String value;

    SettlementStateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettlementStateEnum fromValue(String v) {
        for (SettlementStateEnum c: SettlementStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
