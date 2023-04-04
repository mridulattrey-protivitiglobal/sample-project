<%@ include file="/init.jsp" %>
<%@page import="javax.portlet.PortletURL" %>
<%@page import="com.liferay.sample.service.service.SampleDataLocalServiceUtil" %>

<%
 PortletURL leaveItrUrl = renderResponse.createRenderURL();
leaveItrUrl.setParameter("mvcPath", "/showDetails.jsp");

String orderByType="";
if(orderByType=="asc")
	orderByType="desc";
else
	orderByType="asc";
%>

<liferay-ui:search-container  orderByType="<%=orderByType %>" total="<%=SampleDataLocalServiceUtil.getSampleDatasCount() %>" 
id="searchContainerId" emptyResultsMessage="no-leaves-found" delta="5" deltaConfigurable="true" iteratorURL="<%=leaveItrUrl %>" >
 <liferay-ui:search-container-results results="<%= SampleDataLocalServiceUtil.getSampleDatas(searchContainer.getStart(), searchContainer.getEnd()) %>" >
 </liferay-ui:search-container-results>
 
 <liferay-ui:search-container-row className="com.liferay.sample.service.model.SampleData" modelVar="sampleData" keyProperty="sampleDataId" > 

 <liferay-ui:search-container-column-text property="firstName" name="firstName" orderableProperty="firstName" orderable="<%= true %>"></liferay-ui:search-container-column-text>
 <liferay-ui:search-container-column-text property="lastName" name="lastName" orderableProperty="lastName" orderable="<%= true %>"></liferay-ui:search-container-column-text>
 <liferay-ui:search-container-column-text property="email" name="email" orderableProperty="email" orderable="<%= true %>"></liferay-ui:search-container-column-text>
 <liferay-ui:search-container-column-text property="product" name="product" orderableProperty="product" orderable="<%= true %>"></liferay-ui:search-container-column-text>
 
 <liferay-ui:search-container-column-date property="createDate" name="Created" orderableProperty="createDate" orderable="<%= true %>"></liferay-ui:search-container-column-date>
 <liferay-ui:search-container-column-date property="modifiedDate" name="Modified" orderableProperty="modifiedDate" orderable="<%= true %>"></liferay-ui:search-container-column-date>
<liferay-ui:search-container-column-jsp path="/searchActions.jsp" align="right" />

 </liferay-ui:search-container-row>
 

 <liferay-ui:search-iterator  markupView="lexicon" searchContainer="<%=searchContainer%>" />

</liferay-ui:search-container>

<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Home Page"></aui:button>