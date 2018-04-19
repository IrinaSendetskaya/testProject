<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html >
<html>

 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User main page</title>
</head>
	<body>
	
	<c:out value="${msg_success}"/>
		
		<div class="page-header">
		  <h2> Все авто</h2>
		  <p class="lead"></p>
		</div>
	
		<div class="container">
		<div class="row">
		   <div class="col-md-1">№</div>
		   <div class="col-md-3">Бренд</div>
		   <div class="col-md-3">Модель</div>
		   <div class="col-md-2">
		   <i class="fa fa-car"></i>
		   </div>		
		</div>
		<br>
		
		<c:forEach items="${carlist}" var="car">
		   
		      <div class="row">
		         <div class="col-md-1">${car.id}</div>
		         <div class="col-md-3">${car.brand}</div>
		         <div class="col-md-3">${car.model}</div>
		         <div class="col-md-2">
				     <form action="createorder.jsp" method="post">                       
                          <button id="btnOrder" value="btnOrder" name="btnOrder" class="btn btn-success">
			                  Заказать
			            </button>
                     </form>
			            
	        	 </div>
		
		      </div>		
		   
		
		</c:forEach>
		</div>
		
		<br><br>
		
	</body>
</html>