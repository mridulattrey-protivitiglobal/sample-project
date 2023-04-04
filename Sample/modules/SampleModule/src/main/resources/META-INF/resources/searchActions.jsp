<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="/init.jsp"%>

<%@page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>
<%@page import="com.liferay.sample.service.model.SampleData" %>


<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

SampleData sample = (SampleData)row.getObject(); 
%>
<portlet:renderURL var="editURL">
    <portlet:param name="mvcPath" value="/addDetails.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="deleteProcessActionName" var="deleteURL">
            <portlet:param name="sampleDataId"
                value="<%= String.valueOf(sample.getSampleDataId()) %>" />
            </portlet:actionURL>
            
<liferay-ui:icon-menu>

    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
    
    <liferay-ui:icon-delete image="delete" url="<%=deleteURL.toString() %>" />

</liferay-ui:icon-menu>