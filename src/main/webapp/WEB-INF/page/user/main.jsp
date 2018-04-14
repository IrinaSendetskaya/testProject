<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User main page</title>
</head>
	<body>
	
	<c:out value="${msg_success}"/>
		
		<div class="page-header">
		  <h1> Все авто</h1>
		  <p class="lead"></p>
		</div>
	
		<div class="container">
		<div class="row">
		   <div class="col-md-1">№</div>
		   <div class="col-md-3">Бренд</div>
		   <div class="col-md-3">Модель</div>		
		</div>
		<br>
		
		<c:forEach items="${carlist}" var="car">
		   
		      <div class="row">
		         <div class="col-md-1">${car.id}</div>
		         <div class="col-md-3">
		                     <input id="brand" class="form-control input-md" name="brand" class="form-control"
		                        value="${car.brand}"  />		
		         </div>
		         <div class="col-md-3">${car.model}</div>
		
		      </div>		
		   
		
		</c:forEach>
		</div>
		
		<br><br>
		
	</body>
</html>