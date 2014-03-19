
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import com.evosnap.schemas.cws.v2_0.dataservices.CWSTransactionManagement;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.053-07:00
 * Generated source version: 2.7.7
 * 
 */
public final class ITMSOperations_BasicHttpBindingITMSOperations_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices", "CWSTransactionManagement");

    private ITMSOperations_BasicHttpBindingITMSOperations_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CWSTransactionManagement.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CWSTransactionManagement ss = new CWSTransactionManagement(wsdlURL, SERVICE_NAME);
        ITMSOperations port = ss.getBasicHttpBindingITMSOperations();  
        
        {
        System.out.println("Invoking queryTransactionsSummary...");
        java.lang.String _queryTransactionsSummary_sessionToken = "";
        com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsParameters _queryTransactionsSummary_queryTransactionsParameters = null;
        java.lang.Boolean _queryTransactionsSummary_includeRelated = null;
        com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters _queryTransactionsSummary_pagingParameters = null;
        try {
            com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfSummaryDetail _queryTransactionsSummary__return = port.queryTransactionsSummary(_queryTransactionsSummary_sessionToken, _queryTransactionsSummary_queryTransactionsParameters, _queryTransactionsSummary_includeRelated, _queryTransactionsSummary_pagingParameters);
            System.out.println("queryTransactionsSummary.result=" + _queryTransactionsSummary__return);

        } catch (ITMSOperationsQueryTransactionsSummaryDataServicesUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_DataServicesUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryAuthenticationFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_AuthenticationFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryTMSUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_TMSUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryTMSValidationResultFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_TMSValidationResultFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryExpiredTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_ExpiredTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryInvalidTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_InvalidTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryTMSTransactionFailedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_TMSTransactionFailedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsSummaryTMSUnknownServiceKeyFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsSummary_TMSUnknownServiceKeyFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryTransactionFamilies...");
        java.lang.String _queryTransactionFamilies_sessionToken = "";
        com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsParameters _queryTransactionFamilies_queryTransactionsParameters = null;
        com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters _queryTransactionFamilies_pagingParameters = null;
        try {
            com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfFamilyDetail _queryTransactionFamilies__return = port.queryTransactionFamilies(_queryTransactionFamilies_sessionToken, _queryTransactionFamilies_queryTransactionsParameters, _queryTransactionFamilies_pagingParameters);
            System.out.println("queryTransactionFamilies.result=" + _queryTransactionFamilies__return);

        } catch (ITMSOperationsQueryTransactionFamiliesDataServicesUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_DataServicesUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesAuthenticationFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_AuthenticationFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesTMSUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_TMSUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesTMSValidationResultFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_TMSValidationResultFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_ExpiredTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesInvalidTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_InvalidTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesTMSTransactionFailedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_TMSTransactionFailedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionFamiliesTMSUnknownServiceKeyFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionFamilies_TMSUnknownServiceKeyFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryBatch...");
        java.lang.String _queryBatch_sessionToken = "";
        com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryBatchParameters _queryBatch_queryBatchParameters = null;
        com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters _queryBatch_pagingParameters = null;
        try {
            com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfBatchDetailData _queryBatch__return = port.queryBatch(_queryBatch_sessionToken, _queryBatch_queryBatchParameters, _queryBatch_pagingParameters);
            System.out.println("queryBatch.result=" + _queryBatch__return);

        } catch (ITMSOperationsQueryBatchDataServicesUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_DataServicesUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchAuthenticationFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_AuthenticationFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_TMSUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchTMSValidationResultFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_TMSValidationResultFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchTMSOperationNotSupportedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_TMSOperationNotSupportedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchInvalidTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_InvalidTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchExpiredTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_ExpiredTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_TMSTransactionFailedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryBatchTMSUnknownServiceKeyFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryBatch_TMSUnknownServiceKeyFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryRejectedDetail...");
        java.lang.String _queryRejectedDetail_sessionToken = "";
        com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryRejectedParameters _queryRejectedDetail_queryRejectedParameters = null;
        com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters _queryRejectedDetail_pagingParameters = null;
        try {
            com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryResponse _queryRejectedDetail__return = port.queryRejectedDetail(_queryRejectedDetail_sessionToken, _queryRejectedDetail_queryRejectedParameters, _queryRejectedDetail_pagingParameters);
            System.out.println("queryRejectedDetail.result=" + _queryRejectedDetail__return);

        } catch (ITMSOperationsQueryRejectedDetailDataServicesUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_DataServicesUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_AuthenticationFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailTMSUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_TMSUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailTMSValidationResultFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_TMSValidationResultFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailTMSOperationNotSupportedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_TMSOperationNotSupportedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailExpiredTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_ExpiredTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_InvalidTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailTMSTransactionFailedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_TMSTransactionFailedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedDetailTMSUnknownServiceKeyFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedDetail_TMSUnknownServiceKeyFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryTransactionsDetail...");
        java.lang.String _queryTransactionsDetail_sessionToken = "";
        com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsParameters _queryTransactionsDetail_queryTransactionsParameters = null;
        com.evosnap.schemas.cws.v2_0.dataservices.tms.TransactionDetailFormat _queryTransactionsDetail_transactionDetailFormat = null;
        java.lang.Boolean _queryTransactionsDetail_includeRelated = null;
        com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters _queryTransactionsDetail_pagingParameters = null;
        try {
            com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfTransactionDetail _queryTransactionsDetail__return = port.queryTransactionsDetail(_queryTransactionsDetail_sessionToken, _queryTransactionsDetail_queryTransactionsParameters, _queryTransactionsDetail_transactionDetailFormat, _queryTransactionsDetail_includeRelated, _queryTransactionsDetail_pagingParameters);
            System.out.println("queryTransactionsDetail.result=" + _queryTransactionsDetail__return);

        } catch (ITMSOperationsQueryTransactionsDetailDataServicesUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_DataServicesUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailAuthenticationFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_AuthenticationFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_TMSUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailTMSValidationResultFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_TMSValidationResultFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailInvalidTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_InvalidTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailExpiredTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_ExpiredTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailTMSTransactionFailedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_TMSTransactionFailedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryTransactionsDetailTMSUnknownServiceKeyFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryTransactionsDetail_TMSUnknownServiceKeyFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking ping...");
        com.evosnap.schemas.ipc_general_wcf_contracts_common.external.PingResponse _ping__return = port.ping();
        System.out.println("ping.result=" + _ping__return);


        }
        {
        System.out.println("Invoking queryRejectedSummary...");
        java.lang.String _queryRejectedSummary_sessionToken = "";
        com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryRejectedParameters _queryRejectedSummary_queryRejectedParameters = null;
        com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters _queryRejectedSummary_pagingParameters = null;
        try {
            com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryResponse _queryRejectedSummary__return = port.queryRejectedSummary(_queryRejectedSummary_sessionToken, _queryRejectedSummary_queryRejectedParameters, _queryRejectedSummary_pagingParameters);
            System.out.println("queryRejectedSummary.result=" + _queryRejectedSummary__return);

        } catch (ITMSOperationsQueryRejectedSummaryDataServicesUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_DataServicesUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryAuthenticationFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_AuthenticationFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryTMSUnavailableFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_TMSUnavailableFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_TMSValidationResultFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryTMSOperationNotSupportedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_TMSOperationNotSupportedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryExpiredTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_ExpiredTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryInvalidTokenFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_InvalidTokenFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryTMSTransactionFailedFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_TMSTransactionFailedFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage e) { 
            System.out.println("Expected exception: ITMSOperations_QueryRejectedSummary_TMSUnknownServiceKeyFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
