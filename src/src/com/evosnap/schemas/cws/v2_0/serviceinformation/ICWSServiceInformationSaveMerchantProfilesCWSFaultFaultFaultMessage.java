
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.797-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults")
public class ICWSServiceInformationSaveMerchantProfilesCWSFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSFault cwsFault;

    public ICWSServiceInformationSaveMerchantProfilesCWSFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSaveMerchantProfilesCWSFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSaveMerchantProfilesCWSFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSaveMerchantProfilesCWSFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSFault cwsFault) {
        super(message);
        this.cwsFault = cwsFault;
    }

    public ICWSServiceInformationSaveMerchantProfilesCWSFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSFault cwsFault, Throwable cause) {
        super(message, cause);
        this.cwsFault = cwsFault;
    }

    public com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSFault getFaultInfo() {
        return this.cwsFault;
    }
}
