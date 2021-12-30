<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 29/12/2021
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Liste de toutes les personnes</title>
    </head>
    <body>
        <c:out value="La liste de toutes les personnes : "/>
        <ul>
            <c:forEach var="personne" items="${personnes}">
               <li><c:out value="${personne.nom}"/> <c:out value="${personne.prenom}"/></li>
            </c:forEach>
        </ul>

    </body>
</html>
