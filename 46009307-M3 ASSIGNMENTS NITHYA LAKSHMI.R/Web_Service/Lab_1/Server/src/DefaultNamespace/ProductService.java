/**
 * ProductService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface ProductService extends javax.xml.rpc.Service {
    public java.lang.String getProductAddress();

    public DefaultNamespace.Product getProduct() throws javax.xml.rpc.ServiceException;

    public DefaultNamespace.Product getProduct(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
