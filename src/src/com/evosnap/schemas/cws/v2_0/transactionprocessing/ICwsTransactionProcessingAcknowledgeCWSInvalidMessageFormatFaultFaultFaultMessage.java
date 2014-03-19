
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.145-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidMessageFormatFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingAcknowledgeCWSInvalidMessageFormatFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault;

    public ICwsTransactionProcessingAcknowledgeCWSInvalidMessageFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingAcknowledgeCWSInvalidMessageFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingAcknowledgeCWSInvalidMessageFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingAcknowledgeCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault) {
        super(message);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public ICwsTransactionProcessingAcknowledgeCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault getFaultInfo() {
        return this.cwsInvalidMessageFormatFault;
    }
}
