<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Customer Information</h2>
<a href="<c:url value='/j_spring_security_logout' />" > Logout</a>
<table>
        <tr>
            <td>${status.index+1}</td>
        </tr>
        <tr>
            <td>Name : ${customer.name}</td>
        </tr>
        <tr>
            <td>Surname : ${customer.surname}</td>
        </tr>
        <tr>
            <td>Age : ${customer.age}</td>
        </tr>
        <tr>
            <td>
                <a href="editcustomer?id=${customer.id}">Edit</a><br/>
            </td>
            <td>
                <a href="deletecustomer?id=${customer.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="newcustomer">Add New Customer</a>

</body>
</html>