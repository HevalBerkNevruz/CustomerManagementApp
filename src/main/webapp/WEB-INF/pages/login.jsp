<%--
  Created by IntelliJ IDEA.
  User: heval-Computer
  Date: 6.3.2015
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name='loginForm'
      action="<c:url value='/j_spring_security_check' />" method='POST'>
    <h3>Login with Username and Password</h3>

    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username'></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td colspan='2'><input name="login" type="submit"
                                   value="Login" /></td>
        </tr>
    </table>
    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty info}">
        <div class="msg">${info}</div>
    </c:if>
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>
</body>
</html>
