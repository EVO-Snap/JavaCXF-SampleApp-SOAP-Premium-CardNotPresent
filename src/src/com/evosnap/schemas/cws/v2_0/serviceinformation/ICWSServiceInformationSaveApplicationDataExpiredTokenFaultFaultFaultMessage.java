
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.656-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "ExpiredTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationSaveApplicationDataExpiredTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault;

    public ICWSServiceInformationSaveApplicationDataExpiredTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSaveApplicationDataExpiredTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSaveApplicationDataExpiredTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSaveApplicationDataExpiredTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault) {
        super(message);
        this.expiredTokenFault = expiredTokenFault;
    }

    public ICWSServiceInformationSaveApplicationDataExpiredTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault, Throwable cause) {
        super(message, cause);
        this.expiredTokenFault = expiredTokenFault;
    }

    public com.evosnap.schemas.identity._1.ExpiredTokenFault getFaultInfo() {
        return this.expiredTokenFault;
    }
}
