
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.315-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "LockedByAdminFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyLockedByAdminFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.LockedByAdminFault lockedByAdminFault;

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyLockedByAdminFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyLockedByAdminFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyLockedByAdminFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyLockedByAdminFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.LockedByAdminFault lockedByAdminFault) {
        super(message);
        this.lockedByAdminFault = lockedByAdminFault;
    }

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyLockedByAdminFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.LockedByAdminFault lockedByAdminFault, Throwable cause) {
        super(message, cause);
        this.lockedByAdminFault = lockedByAdminFault;
    }

    public com.evosnap.schemas.identity._1.LockedByAdminFault getFaultInfo() {
        return this.lockedByAdminFault;
    }
}
