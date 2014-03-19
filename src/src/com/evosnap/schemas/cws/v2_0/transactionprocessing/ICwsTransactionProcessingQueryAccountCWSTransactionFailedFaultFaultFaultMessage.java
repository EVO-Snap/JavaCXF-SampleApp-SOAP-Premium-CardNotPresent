
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.291-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSTransactionFailedFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingQueryAccountCWSTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault;

    public ICwsTransactionProcessingQueryAccountCWSTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingQueryAccountCWSTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingQueryAccountCWSTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingQueryAccountCWSTransactionFailedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault) {
        super(message);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public ICwsTransactionProcessingQueryAccountCWSTransactionFailedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault getFaultInfo() {
        return this.cwsTransactionFailedFault;
    }
}
