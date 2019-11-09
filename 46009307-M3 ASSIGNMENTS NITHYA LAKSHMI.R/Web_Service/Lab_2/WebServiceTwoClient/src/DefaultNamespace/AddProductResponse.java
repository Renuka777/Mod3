/**
 * AddProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class AddProductResponse  implements java.io.Serializable {
    private java.lang.Object[] addProductReturn;

    public AddProductResponse() {
    }

    public AddProductResponse(
           java.lang.Object[] addProductReturn) {
           this.addProductReturn = addProductReturn;
    }


    /**
     * Gets the addProductReturn value for this AddProductResponse.
     * 
     * @return addProductReturn
     */
    public java.lang.Object[] getAddProductReturn() {
        return addProductReturn;
    }


    /**
     * Sets the addProductReturn value for this AddProductResponse.
     * 
     * @param addProductReturn
     */
    public void setAddProductReturn(java.lang.Object[] addProductReturn) {
        this.addProductReturn = addProductReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddProductResponse)) return false;
        AddProductResponse other = (AddProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addProductReturn==null && other.getAddProductReturn()==null) || 
             (this.addProductReturn!=null &&
              java.util.Arrays.equals(this.addProductReturn, other.getAddProductReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddProductReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddProductReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddProductReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DefaultNamespace", ">addProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addProductReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DefaultNamespace", "addProductReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://DefaultNamespace", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
