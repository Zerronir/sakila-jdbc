<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<!-- HEAD -->
    <%@ include file="partials/header.jsp" %>
<!-- HEAD -->
<body>
<h1>Hello, world!</h1>

<ul>
    <form action="/staff/login" method="post">
        <input type="text" name="email" placeholder="Introduce tu email">
        <button type="submit">Inicia sesión</button>
    </form>
</ul>

<!-- FOOTER -->
    <%@ include file="partials/footer.jsp" %>
<!-- FOOTER -->
</body>
</html>