<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Department List</title>
 </head>
 <body>
     <div align="center">
         <h1>Dia chinh List</h1>
         <table border="1">
             <th>Id</th>
             <th>Ma</th>
             <th>Ten</th>
                         
             <c:forEach var="dc" items="${diachinhs}" varStatus="status">
             <tr>
                 <td>${status.index + 1}</td>
                 <td>${dc.dcMa}</td>
                 <td>${dc.dcTen}</td>
                                            
             </tr>
             </c:forEach>                
         </table>
     </div>
 </body>
</html>