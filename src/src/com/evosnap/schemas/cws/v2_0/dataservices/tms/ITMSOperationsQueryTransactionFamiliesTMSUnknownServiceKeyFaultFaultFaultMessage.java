
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.293-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "TMSUnknownServiceKeyFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults")
public class ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault tmsUnknownServiceKeyFault;

    public ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault tmsUnknownServiceKeyFault) {
        super(message);
        this.tmsUnknownServiceKeyFault = tmsUnknownServiceKeyFault;
    }

    public ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault tmsUnknownServiceKeyFault, Throwable cause) {
        super(message, cause);
        this.tmsUnknownServiceKeyFault = tmsUnknownServiceKeyFault;
    }

    public com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault getFaultInfo() {
        return this.tmsUnknownServiceKeyFault;
    }
}
