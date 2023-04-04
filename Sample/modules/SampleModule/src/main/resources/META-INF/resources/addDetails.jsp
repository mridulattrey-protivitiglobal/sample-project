<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.sample.service.service.SampleDataLocalServiceUtil"%>
<%@page import="com.liferay.sample.service.model.SampleData"%>
<%@ include file="/init.jsp" %>


<%
long sampleDataId = 1;
SampleData sampleData = null;
if(Validator.isNotNull(sampleDataId)){
	sampleData = SampleDataLocalServiceUtil.fetchSampleData(sampleDataId);
}
%>

 <portlet:actionURL var="practiceProcessAction" name="practiceProcessActionName"/>
<liferay-ui:success key="success" message="Your data has been saved successfully!"
/>
<liferay-ui:error key="error" message="Sorry, an error prevented your data from being saved!" />
<aui:form name="fm" action="<%= practiceProcessAction %>">
					
		<aui:input name="sampleDataId" type="hidden" value="<%= sampleDataId %>"/> 

		<aui:fieldset label="Personal Information">
			<aui:row>
				<aui:col width="50">
					<aui:input label="First Name" name="firstName" type="text" value="<%= Validator.isNotNull(sampleData) ? sampleData.getFirstName() : StringPool.BLANK %>"> 
					<aui:validator name="required" errorMessage="Please provide the first name."></aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Last Name" name="lastName" type="text" value="<%= Validator.isNotNull(sampleData) ? sampleData.getLastName() : StringPool.BLANK %>"> 
					<aui:validator name="required"></aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="Contact Number" name="contactNumber" type="text" value="<%= Validator.isNotNull(sampleData) ? sampleData.getMobileNumber() : StringPool.BLANK %>">
					<aui:validator name="required"></aui:validator>
					
					<aui:validator name="minLength">10</aui:validator>
					<aui:validator name="maxLength">10</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Email" name="email" type="email" value="<%= Validator.isNotNull(sampleData) ? sampleData.getEmail(): StringPool.BLANK %>"> 
					<aui:validator name="email"/>
					<aui:validator name="required"></aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
		<aui:select id="sync-product-single-select" name="product" placeholder="Select a product" value="<%= Validator.isNotNull(sampleData) ? sampleData.getProduct() : StringPool.BLANK %>">
            <aui:validator name="required"></aui:validator>
            <aui:option></aui:option>
            <aui:option value="jira">JIRA</aui:option>
            <aui:option value="confluence">Confluence</aui:option>
            <aui:option value="stash">Stash</aui:option>
            <aui:option value="fecru">FeCru</aui:option>
            <aui:option value="hipchat">HipChat</aui:option>
        </aui:select>
        </aui:col>
    <aui:col width= "50">
    <aui:input label="Date of Expiry" name="dateOfExpiry" type="date" value="<%= Validator.isNotNull(sampleData) ? sampleData.getExpiryDate() : StringPool.BLANK %>">
     <aui:validator name="custom"  errorMessage="Expiration date cannot be in the past.">
     function (val, fieldNode, ruleValue) {
     	
     	var val = new Date(Date.parse(val,"MMM dd yyyy"));
     	
       	var today=new Date();
		if(today>=val)
			return(false);
		return(true);

                                     }
                              </aui:validator>
    </aui:input>
    </aui:col>
    </aui:row>
      </aui:fieldset>
		<aui:fieldset label="Miscellaneous">
			<aui:input label="Hobbies" name="hobbies" type="textarea" value="<%= Validator.isNotNull(sampleData) ? sampleData.getHobbies(): StringPool.BLANK %>"/>
			<aui:input label="Allow site admin to store form data." name="consent" type="checkbox" value="<%= Validator.isNotNull(sampleData) ? sampleData.getConsent() : StringPool.BLANK %>">
				<aui:validator name="required"></aui:validator>
			</aui:input>
		</aui:fieldset>
	<aui:button-row>
		<aui:button name="submitButton" type="submit" value="Submit" />
	
	
	<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Home Page"></aui:button>
</aui:button-row>
</aui:form>