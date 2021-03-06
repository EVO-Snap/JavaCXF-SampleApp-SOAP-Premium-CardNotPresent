
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.214-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "DataServicesUnavailableFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices")
public class ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault dataServicesUnavailableFault;

    public ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault dataServicesUnavailableFault) {
        super(message);
        this.dataServicesUnavailableFault = dataServicesUnavailableFault;
    }

    public ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault dataServicesUnavailableFault, Throwable cause) {
        super(message, cause);
        this.dataServicesUnavailableFault = dataServicesUnavailableFault;
    }

    public com.evosnap.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault getFaultInfo() {
        return this.dataServicesUnavailableFault;
    }
}
