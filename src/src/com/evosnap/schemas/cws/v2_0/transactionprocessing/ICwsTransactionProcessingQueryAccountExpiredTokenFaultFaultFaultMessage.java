
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.298-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "ExpiredTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICwsTransactionProcessingQueryAccountExpiredTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault;

    public ICwsTransactionProcessingQueryAccountExpiredTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingQueryAccountExpiredTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingQueryAccountExpiredTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingQueryAccountExpiredTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault) {
        super(message);
        this.expiredTokenFault = expiredTokenFault;
    }

    public ICwsTransactionProcessingQueryAccountExpiredTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault, Throwable cause) {
        super(message, cause);
        this.expiredTokenFault = expiredTokenFault;
    }

    public com.evosnap.schemas.identity._1.ExpiredTokenFault getFaultInfo() {
        return this.expiredTokenFault;
    }
}
