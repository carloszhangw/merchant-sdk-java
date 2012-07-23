package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.BillOutstandingAmountRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class BillOutstandingAmountRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	 
	 */ 
	private BillOutstandingAmountRequestDetailsType BillOutstandingAmountRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public BillOutstandingAmountRequestType (){
	}	

	/**
	 * Getter for BillOutstandingAmountRequestDetails
	 */
	 public BillOutstandingAmountRequestDetailsType getBillOutstandingAmountRequestDetails() {
	 	return BillOutstandingAmountRequestDetails;
	 }
	 
	/**
	 * Setter for BillOutstandingAmountRequestDetails
	 */
	 public void setBillOutstandingAmountRequestDetails(BillOutstandingAmountRequestDetailsType BillOutstandingAmountRequestDetails) {
	 	this.BillOutstandingAmountRequestDetails = BillOutstandingAmountRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(BillOutstandingAmountRequestDetails != null) {
			sb.append("<ebl:BillOutstandingAmountRequestDetails>");
			sb.append(BillOutstandingAmountRequestDetails.toXMLString());
			sb.append("</ebl:BillOutstandingAmountRequestDetails>");
		}
		return sb.toString();
	}

}