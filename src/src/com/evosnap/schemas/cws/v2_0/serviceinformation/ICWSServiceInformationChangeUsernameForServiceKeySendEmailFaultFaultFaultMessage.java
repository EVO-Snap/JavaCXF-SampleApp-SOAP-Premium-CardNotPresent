
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.707-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "SendEmailFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationChangeUsernameForServiceKeySendEmailFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.SendEmailFault sendEmailFault;

    public ICWSServiceInformationChangeUsernameForServiceKeySendEmailFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeySendEmailFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeySendEmailFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationChangeUsernameForServiceKeySendEmailFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.SendEmailFault sendEmailFault) {
        super(message);
        this.sendEmailFault = sendEmailFault;
    }

    public ICWSServiceInformationChangeUsernameForServiceKeySendEmailFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.SendEmailFault sendEmailFault, Throwable cause) {
        super(message, cause);
        this.sendEmailFault = sendEmailFault;
    }

    public com.evosnap.schemas.identity._1.SendEmailFault getFaultInfo() {
        return this.sendEmailFault;
    }
}
