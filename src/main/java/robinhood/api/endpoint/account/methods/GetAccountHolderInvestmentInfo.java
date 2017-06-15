package robinhood.api.endpoint.account.methods;

import robinhood.api.ConfigurationManager;
import robinhood.api.endpoint.account.Account;
import robinhood.api.endpoint.account.data.AccountHolderInvestmentElement;
import robinhood.api.parameters.HttpHeaderParameter;
import robinhood.api.request.RequestMethod;

public class GetAccountHolderInvestmentInfo extends Account {
	
	public GetAccountHolderInvestmentInfo() {
		
		this.setUrlBase("https://api.robinhood.com/accounts" + ConfigurationManager.getInstance().getAccountNumber() + "/positions/");
		
		//Add the headers into the request
		this.addHttpHeaderParameter(new HttpHeaderParameter("Accept", "application/json"));
		
		//This method is to be ran as GET
		this.setMethod(RequestMethod.GET);
		
		//Declare what the response should look like
		this.setReturnType(AccountHolderInvestmentElement.class);
	}

}
