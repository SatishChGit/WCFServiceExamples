package org.tempuri;

public class IFirstWebServiceProxy implements org.tempuri.IFirstWebService {
  private String _endpoint = null;
  private org.tempuri.IFirstWebService iFirstWebService = null;
  
  public IFirstWebServiceProxy() {
    _initIFirstWebServiceProxy();
  }
  
  public IFirstWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIFirstWebServiceProxy();
  }
  
  private void _initIFirstWebServiceProxy() {
    try {
      iFirstWebService = (new org.tempuri.Service1Locator()).getBasicHttpBinding_IFirstWebService();
      if (iFirstWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iFirstWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iFirstWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iFirstWebService != null)
      ((javax.xml.rpc.Stub)iFirstWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IFirstWebService getIFirstWebService() {
    if (iFirstWebService == null)
      _initIFirstWebServiceProxy();
    return iFirstWebService;
  }
  
  public java.lang.Integer add(java.lang.Integer num1, java.lang.Integer num2) throws java.rmi.RemoteException{
    if (iFirstWebService == null)
      _initIFirstWebServiceProxy();
    return iFirstWebService.add(num1, num2);
  }
  
  
}