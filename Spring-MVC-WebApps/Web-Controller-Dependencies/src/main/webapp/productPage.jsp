<html>
   
<%@ page session="false"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 
<head><title>
The Product Page display
</title>
</head><body>
 <h1>The List of Products here</h1>
 <p>Date Current : 
 
 
  <c:out value="${model.MyDate}"/>
  
   </p>
  <h3>Products</h3>

<c:forEach items="${model.products}" var="prod">
  <c:out value="${prod.description}"/> 
   <i>$<c:out value="${prod.price}"/></i>
   <br><br>
</c:forEach>
</body>
</html>