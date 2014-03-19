
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.391-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSTransactionServiceUnavailableFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingUndoCWSTransactionServiceUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault cwsTransactionServiceUnavailableFault;

    public ICwsTransactionProcessingUndoCWSTransactionServiceUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingUndoCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingUndoCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingUndoCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault cwsTransactionServiceUnavailableFault) {
        super(message);
        this.cwsTransactionServiceUnavailableFault = cwsTransactionServiceUnavailableFault;
    }

    public ICwsTransactionProcessingUndoCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault cwsTransactionServiceUnavailableFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionServiceUnavailableFault = cwsTransactionServiceUnavailableFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault getFaultInfo() {
        return this.cwsTransactionServiceUnavailableFault;
    }
}
