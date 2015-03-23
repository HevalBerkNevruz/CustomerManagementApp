<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Customer Add</h2>
<a href="<c:url value='/j_spring_security_logout' />" > Logout</a>
<form action="${logoutUrl}" method="post" id="logoutForm">
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>
<form:form method="POST" action="/SpringMVCFirstProject/savecustomer" modelAttribute="customer" commandName="customer">
    <table>
        <form:hidden path="id"/>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" /></td>
            <td style="color:red"><form:errors path="name" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td><form:label path="surname">Surname</form:label></td>
            <td><form:input path="surname" /></td>
            <td style="color:red"><form:errors path="surname" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td><form:label path="password">password</form:label></td>
            <td><form:password path="password" /></td>
            <td style="color:red"><form:errors path="password" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age" /></td>
            <td><form:errors path="age" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>