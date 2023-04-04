<%@ include file="/init.jsp" %>

<aui:button-row>
<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/addDetails.jsp"></portlet:param>
</portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add New Entry"></aui:button>



<portlet:renderURL var="showEntryURL">
    <portlet:param name="mvcPath" value="/showDetails.jsp"></portlet:param>
</portlet:renderURL>
    <aui:button onClick="<%= showEntryURL.toString() %>" value="Show Entries"></aui:button>



<portlet:renderURL var="showEntryURL">
    <portlet:param name="mvcPath" value="/showDetailsMgBar.jsp"></portlet:param>
</portlet:renderURL>
    <aui:button onClick="<%= showEntryURL.toString() %>" value="Show Entries with Mg Bar"></aui:button>
</aui:button-row>