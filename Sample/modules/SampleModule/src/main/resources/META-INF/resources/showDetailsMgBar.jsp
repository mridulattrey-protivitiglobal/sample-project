<h1>Management bar page...</h1>
<%-- <%@ include file="/init.jsp" %>

<%@page import="javax.portlet.PortletURL" %>
<%@page import="com.liferay.sample.service.service.SampleDataLocalServiceUtil" %>

<%= PortletURL myViewURL = renderResponse.createRenderURL();
myViewURL.setParameter("mvcPath", "/showDetails.jsp");
String displayStyle = ParamUtil.getString(request, "displayStyle", "list");
%>

<liferay-ui:search-container-column-text
        cssClass="content-column name-column title-column"
        name="name"
        truncate="<%= true %>"
        value="<%= rule.getName(locale) %>"
/>

<liferay-ui:search-container-column-text
        cssClass="content-column description-column"
        name="description"
        truncate="<%= true %>"
        value="<%= rule.getDescription(locale) %>"
/>

<liferay-ui:search-container-column-date
        cssClass="create-date-column text-column"
        name="create-date"
        property="createDate"
/>

<liferay-ui:search-container-column-text
        cssClass="text-column type-column"
        name="type"
        translate="<%= true %>"
        value="<%= rule.getType() %>"
/>

<liferay-ui:search-container-column-jsp
        cssClass="entry-action-column"
        path="/rule_actions.jsp"
/>

<liferay-ui:search-iterator

    displayStyle="<%= displayStyle %>"
    markupView="lexicon"
    searchContainer="<%= searchContainer %>"
/>
 --%>