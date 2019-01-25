/**
 * Service1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Service1Locator extends org.apache.axis.client.Service implements org.tempuri.Service1 {

    public Service1Locator() {
    }


    public Service1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Service1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IFirstWebService
    private java.lang.String BasicHttpBinding_IFirstWebService_address = "http://localhost:51426/FirstWebService.svc";

    public java.lang.String getBasicHttpBinding_IFirstWebServiceAddress() {
        return BasicHttpBinding_IFirstWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IFirstWebServiceWSDDServiceName = "BasicHttpBinding_IFirstWebService";

    public java.lang.String getBasicHttpBinding_IFirstWebServiceWSDDServiceName() {
        return BasicHttpBinding_IFirstWebServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IFirstWebServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IFirstWebServiceWSDDServiceName = name;
    }

    public org.tempuri.IFirstWebService getBasicHttpBinding_IFirstWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IFirstWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IFirstWebService(endpoint);
    }

    public org.tempuri.IFirstWebService getBasicHttpBinding_IFirstWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IFirstWebServiceStub _stub = new org.tempuri.BasicHttpBinding_IFirstWebServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IFirstWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IFirstWebServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IFirstWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IFirstWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IFirstWebServiceStub _stub = new org.tempuri.BasicHttpBinding_IFirstWebServiceStub(new java.net.URL(BasicHttpBinding_IFirstWebService_address), this);
                _stub.setPortName(getBasicHttpBinding_IFirstWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IFirstWebService".equals(inputPortName)) {
            return getBasicHttpBinding_IFirstWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Service1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IFirstWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IFirstWebService".equals(portName)) {
            setBasicHttpBinding_IFirstWebServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
