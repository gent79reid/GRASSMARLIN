//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 05:34:31 PM EST 
//


package core.fingerprint3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsDataAtFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsDataAtFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AndThen"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Offset" use="required" type="{}FrameSize" />
 *       &lt;attribute ref="{}Relative"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsDataAtFunction", propOrder = {
    "andThen"
})
public class IsDataAtFunction implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AndThen", required = true)
    protected AndThen andThen;
    @XmlAttribute(name = "Offset", required = true)
    protected int offset;
    @XmlAttribute(name = "Relative")
    protected Boolean relative;

    /**
     * Gets the value of the andThen property.
     * 
     * @return
     *     possible object is
     *     {@link AndThen }
     *     
     */
    public AndThen getAndThen() {
        return andThen;
    }

    /**
     * Sets the value of the andThen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndThen }
     *     
     */
    public void setAndThen(AndThen value) {
        this.andThen = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRelative() {
        if (relative == null) {
            return false;
        } else {
            return relative;
        }
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelative(Boolean value) {
        this.relative = value;
    }

}