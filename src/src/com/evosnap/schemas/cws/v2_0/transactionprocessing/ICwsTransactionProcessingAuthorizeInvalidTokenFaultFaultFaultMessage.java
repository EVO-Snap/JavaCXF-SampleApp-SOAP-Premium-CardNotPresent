
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.440-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "InvalidTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICwsTransactionProcessingAuthorizeInvalidTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault;

    public ICwsTransactionProcessingAuthorizeInvalidTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingAuthorizeInvalidTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingAuthorizeInvalidTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingAuthorizeInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault) {
        super(message);
        this.invalidTokenFault = invalidTokenFault;
    }

    public ICwsTransactionProcessingAuthorizeInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault, Throwable cause) {
        super(message, cause);
        this.invalidTokenFault = invalidTokenFault;
    }

    public com.evosnap.schemas.identity._1.InvalidTokenFault getFaultInfo() {
        return this.invalidTokenFault;
    }
}
