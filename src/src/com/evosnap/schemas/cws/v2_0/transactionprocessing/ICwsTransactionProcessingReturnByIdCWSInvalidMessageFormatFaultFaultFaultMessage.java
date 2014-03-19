
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.040-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidMessageFormatFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingReturnByIdCWSInvalidMessageFormatFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault;

    public ICwsTransactionProcessingReturnByIdCWSInvalidMessageFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingReturnByIdCWSInvalidMessageFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingReturnByIdCWSInvalidMessageFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingReturnByIdCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault) {
        super(message);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public ICwsTransactionProcessingReturnByIdCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault getFaultInfo() {
        return this.cwsInvalidMessageFormatFault;
    }
}
