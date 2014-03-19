
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.922-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidOperationFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureSelectiveCWSInvalidOperationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault;

    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidOperationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidOperationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidOperationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidOperationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault) {
        super(message);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidOperationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault getFaultInfo() {
        return this.cwsInvalidOperationFault;
    }
}
