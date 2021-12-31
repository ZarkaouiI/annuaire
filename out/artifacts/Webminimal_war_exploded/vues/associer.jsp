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
        <title>Associer</title>
    </head>
    <body>
        <c:out value="Vous êtes dans la page d'association des personnes à des adresses!"/>
        <input type="hidden" name="id" id="3">

        <div>
            <c:forEach var="personne" items="${personnes}">
                <input type="checkbox" name="personne" id="personne">
                <label for="personne"><c:out value="${personne.nom}"/> <c:out value="${personne.prenom}"/></label>
            </c:forEach>
        </div>
    </body>
</html>
