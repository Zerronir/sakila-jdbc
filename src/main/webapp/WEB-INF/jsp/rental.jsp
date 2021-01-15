<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<%@include file="partials/head.jsp"%>
<body>

<!-- HEADER -->
<%@ include file="./partials/header.jsp"%>
<!-- HEADER -->


<select name="" id="">
    <option value="">-- Selecciona una pelicula --</option>
    <c:forEach var="f" items="${films}">
        <option value="${f.title}">-- ${f.title} --</option>
    </c:forEach>
</select>



<!-- FOOTER -->
    <%@ include file="partials/footer.jsp" %>
<!-- FOOTER -->
</body>
</html>